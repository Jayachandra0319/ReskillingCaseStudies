package casestudy10;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesAndWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("Open New Window")).click();
		driver.findElement(By.linkText("Click Here")).click();
		String parent = driver.getWindowHandle();
		Set<String>all = driver.getWindowHandles();
		for(String newwindow:all) {
			if(!parent.equals(newwindow)) {
				driver.switchTo().window(newwindow);
				//System.out.println(newwindow);
			}
			System.out.println(newwindow);
			
		}
		

	}

}
