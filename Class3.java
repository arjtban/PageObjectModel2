package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import reusablePackage.ReusebaleClass;

public class Class3 extends ReusebaleClass {
	WebDriver driver;

	public Class3(WebDriver driver) {

		// Passing driver object to the parent class,
		// because the parent class is also using the object for internal method.

		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Pagefactory

	@FindBy(xpath = "//*[@id='mf-section-0']/ul[1]/li/a")
	WebElement listlink;

	@FindBy(xpath = "//*[@id='content-collapsible-block-0']/ul/li")
	List<WebElement> listitems;

	By surnamelist = By.xpath("//*[@id='content-collapsible-block-0']/ul/li");

	public List<WebElement> getList() {
		waitforElementtoAppear(surnamelist);
		return listitems;
	}

	public void findlist() {
		listlink.click();
		List<WebElement> l=getList();
		for(WebElement x:l) {
			System.out.println(x.getText());
		}
	}

}
