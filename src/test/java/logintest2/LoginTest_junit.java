
package logintest2;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_junit {

	WebDriver driver;

//public void beforeClasss() {
//	System.out.println("Before Method");
//}

	@Before

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "\\drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/test/billing/?ng=admin/");

	}

	@Test
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	    driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();

	}

//@Test
	public  void negloginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");
	driver.findElement(By.name("login")).click();
}

 @After
	public void teardown() {
		driver.quit();
		driver.close();
	}
}
