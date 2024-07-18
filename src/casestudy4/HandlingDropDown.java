package casestudy4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement createaccount = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
		createaccount.click();
		driver.findElement(By.name("firstname")).sendKeys("Jayachandra");
		driver.findElement(By.name("lastname")).sendKeys("Vadde");
		driver.findElement(By.name("reg_email__")).sendKeys("917705572");
		driver.findElement(By.name("reg_passwd__")).sendKeys("ammanana");
		Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		day.selectByValue("19");
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByValue("3");
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByValue("2001");
		WebElement male = driver.findElement(By.xpath("//input[@value=\"2\"]"));
		male.click();
		driver.findElement(By.name("websubmit")).click();
		WebElement error =driver.findElement(By.xpath("//*[contains(text(),'Please enter a valid mobile number or email address')]"));
		System.out.println("Error: "+error.getText());
		//driver.close();
	}

}
