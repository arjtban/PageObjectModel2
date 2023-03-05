package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/home/arijit/Documents/WebDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.m.wikipedia.org/wiki/List");
		Class3 obj2=new Class3(driver);
		obj2.findlist();
	}

}
