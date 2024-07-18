package casestudy2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTests {
	
	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		testOpenDifferentBrowsers(driver);
		System.out.println("Chrome "+driver.getTitle());
		//driver.close();
//		WebDriver driver2 = new EdgeDriver();
//		testOpenDifferentBrowsers(driver2);
//		System.out.println("Edge "+driver2.getTitle());
//		//driver2.close();
		
		
	}
	
	public static void testOpenDifferentBrowsers(WebDriver driver){
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Assert.assertEquals("Google", driver.getTitle());

	}

}
