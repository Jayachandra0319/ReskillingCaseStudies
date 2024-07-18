package casestudy3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String currentURL = driver.getCurrentUrl();
		System.out.println("CurrentURL"+ currentURL);
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi note 12");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		//js.executeScript("argument[0].scrollIntoView", price);
//		WebElement price = driver.findElement(By.xpath("//li[@id=\"p_36/1318506031\"]/span/a/span"));
//		js.executeScript("arguments[0].click();", price);
//		WebElement topbrand = driver.findElement(By.xpath("//span[contains(text(),'Top Brands')]"));
//		//topbrand.click();
//		js.executeScript("arguments[0].click();", topbrand);
//		WebElement Title = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
//		System.out.println("Mobile Name: "+Title.getText());
		driver.close();
		
		
	}

}
