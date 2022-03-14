package variousconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassOne {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\mfakh\\seleniumoctober\\Session1\\drive\\chromedriver.exe");
		// make object
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.close();
		driver.quit();

	}

}
