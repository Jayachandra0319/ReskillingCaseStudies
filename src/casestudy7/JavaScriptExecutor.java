package casestudy7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/samplepagetest/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement name = driver.findElement(By.name("g2599-name"));
		js.executeScript("arguments[0].value='Jayachandra';", name);
		WebElement email = driver.findElement(By.name("g2599-email"));
		js.executeScript("arguments[0].value='vaddejay@gmail.com';", email);
		WebElement website = driver.findElement(By.name("g2599-website"));
		js.executeScript("arguments[0].value='https://amazon.in/';", website);
		WebElement experience = driver.findElement(By.name("g2599-experienceinyears"));
		js.executeScript("arguments[0].value='1-3';", experience);
		WebElement functional = driver.findElement(By.xpath("//input[@value='Functional Testing']"));
		js.executeScript("arguments[0].click()", functional);
		WebElement  automation = driver.findElement(By.xpath("//input[@value='Automation Testing']"));
		js.executeScript("arguments[0].click();", automation);
		WebElement manual = driver.findElement(By.xpath("//input[@value='Manual Testing']"));
		js.executeScript("arguments[0].click();", manual);
		WebElement education = driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[6]/label[2]"));
		js.executeScript("arguments[0].click()", education);
		WebElement alert = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		js.executeScript("arguments[0].click();", alert);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		WebElement comment = driver.findElement(By.name("g2599-comment"));
		js.executeScript("arguments[0].value='uihehugfuhgfyruygrefugryf';", comment);
		WebElement submit = driver.findElement(By.xpath("//button[@class='pushbutton-wide']"));
		js.executeScript("arguments[0].click();", submit);
		driver.close();

	}

}
