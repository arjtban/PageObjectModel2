package reusablePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusebaleClass {
	WebDriver driver;
	
	public ReusebaleClass(WebDriver driver) {
		this.driver = driver;
	}

	public void waitforElementtoAppear(By anElement) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
//		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(anElement));
	}

}
