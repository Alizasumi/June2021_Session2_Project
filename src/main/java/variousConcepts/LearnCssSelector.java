package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCssSelector {
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
//		using Css Selector(# represents Id and .represents class)
		driver.findElement(By.cssSelector("input#exp-2")).click();
//		driver.findElement(By.cssSelector("input.input-file")).sendKeys("C:\\Users\\admin\\June2021_Selenium");
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("0020219020");
//		you can have multiple attribute, to find unique value you can use multiple attribute
		driver.findElement(By.cssSelector("input[type='checkbox'][id='profession-1']")).click();
	}

//	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
