package casestudy9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager) ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		WebElement from1 = driver.findElement(By.cssSelector("img[alt='The peaks of High Tatras']"));
		WebElement to1 = driver.findElement(By.id("trash"));
		WebElement from2 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(from1, to1).build().perform();
		action.dragAndDrop(from2, to1).build().perform();
		driver.quit();
	}

}
