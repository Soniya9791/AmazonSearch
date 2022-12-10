package Practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Brower {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\drivers\\firefox\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

}
