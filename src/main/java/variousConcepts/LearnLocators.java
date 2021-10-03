package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

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
	public void testLocators() {
		// using name
		driver.findElement(By.name("firstname")).sendKeys("Selenium");// t

		// using id
		driver.findElement(By.id("sex-1")).click();

		// using classname, if there is no input in your code you use robot class.use robot class if element node is not input.
		driver.findElement(By.className("input-file"))
				.sendKeys("C:\\Users\\admin\\June2021_Selenium\\SessionOne\\driver");

		// Link text
		// driver.findElement(By.linkText("Link Test : Page Change")).click();

		// Partial link text (it has to be unique or you can use link test or find if
		// its duplicate or use another word
		driver.findElement(By.partialLinkText("Product Backend")).click();

	}

//	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
