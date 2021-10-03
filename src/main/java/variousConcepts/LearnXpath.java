package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {
	WebDriver driver;

	@Before
	public void init() {
		// line 10 and 11 help us to launch the browser
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testLocators() throws InterruptedException {
		// using absolute Xpath
//		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[1]/a/strong")).click();
//		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[4]/a/strong")).click();
//		driver.findElement(By.xpath("html/body/div/div[2]/div/h4[3]/a")).click();
		Thread.sleep(3000);
		
		// using relative path
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='tool-2' and@type='checkbox' and@value='Selenium Webdriver']")).click();
		
		//xpath for links
//		driver.findElement(By.xpath("//a[text()='TF-API Product Backend']")).click();
		//this path need to learn its used in the industry
//		driver.findElement(By.xpath("//a[contains(text(),'API Documentations')]")).click();
//wrong	driver.findElement(By.xpath("//a[contains(text(),'Link Test : Page Change')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'OS-API Product FrontEnd')]")).click();
	
	}

//	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
