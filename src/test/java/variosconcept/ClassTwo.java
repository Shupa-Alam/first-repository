package variosconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTwo {
	static WebDriver driver;

	public static void main(String[] args) {
		launchBrowser();
		loginTest();
		teardown();

		launchBrowser();
		negloginTest();
		teardown();

	}

	public static void launchBrowser() {
		// set up system Property
		System.setProperty("webdriver.chrome.driver", ".\\drive\\chromedriver.exe");
		// Create object
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/billing/?ng=admin/");
	}

	// identification of element
	public static void loginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}

	public static void negloginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}
	public static void teardown() {
//close the browser
	driver.close();
	driver.quit();
}
}
