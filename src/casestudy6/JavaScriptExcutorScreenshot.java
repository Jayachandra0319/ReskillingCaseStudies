package casestudy6;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExcutorScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement se = driver.findElement(By.name("q"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow')", se);
		js.executeScript("arguments[0].value='selenium'",se);
		//js.executeScript("arguments[0].dispatchEvent(newKeyboardEvent('keydown',{key:'Enter'}));",se);
		se.sendKeys(Keys.ENTER);
		TakesScreenshot capture = (TakesScreenshot)driver;
		File srcfile = capture.getScreenshotAs(OutputType.FILE);
		File destfile = new File(System.getProperty("user.dir")+"/screenshots/screenshot.png");
		Files.copy(srcfile, destfile);
	}

}
