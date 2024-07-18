package casestudy5;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme narzo 60 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'(Mars Orange,8GB+128GB) MediaTek Dimensity 7050 | ')]")).click();
		Set<String>s = driver.getWindowHandles();
		for(String child:s)
			driver.switchTo().window(child);
		driver.findElement(By.name("submit.add-to-cart")).click();
		Thread.sleep(3);
		driver.findElement(By.xpath("//form[@id='attach-view-cart-button-form']/span /span")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		driver.close();
		driver.switchTo().window(parent);
		driver.close();
			
	}

}
