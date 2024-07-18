package casestudy8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertsAndPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][normalize-space()='Click me!']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[normalize-space()='Click for Prompt Box']")).click();
		driver.switchTo().alert().sendKeys("Jay");
		driver.switchTo().alert().accept();
		//driver.close();
		

	}

}
