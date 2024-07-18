package casestudy11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAndKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/sliders/#Range");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider-range']"));
		WebElement lowestrange = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		WebElement highesttrange = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
		Actions action = new Actions(driver);
		action.clickAndHold(lowestrange).moveByOffset(-105,0).release().perform();
		action.clickAndHold(highesttrange).moveByOffset(275,0).release().perform();
		action.clickAndHold(lowestrange).moveByOffset(136, 0).release().perform();
		action.clickAndHold(highesttrange).moveByOffset(-136, 0).release().perform();

	}

}
