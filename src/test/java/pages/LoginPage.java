package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='loginusername']")
	WebElement user;

	@FindBy(xpath = "//input[@id='loginpassword']")
	WebElement pass;

	@FindBy(xpath = "//button[contains(@onclick,'logIn()')]")
	WebElement loginButton;

	@FindBy(xpath = "//a[@id='logout2']")
	WebElement logout;

	@FindBy(id = "nameofuser")
	WebElement validation;

	public LoginPage userName(String username) {
		sendKeysMethod(user, username);
		return this;
	}

	public LoginPage passWord(String password) {
		sendKeysMethod(pass, password);
		return this;
	}

	public LoginPage loginButton() throws InterruptedException {
		ele = driver.findElement(By.xpath("//button[contains(@onclick,'logIn()')]"));
		driver.findElement(By.xpath("//input[@id='loginusername']"));
		Assert.assertTrue(ele.isEnabled(), "login button is enabled");
		Thread.sleep(5000);
		loginButton.click();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		return this;
	}

	public LoginPage refresh() {
		driver.navigate().refresh();
		return this;
	}

	public HomePage validation() {
		ele = driver.findElement(By.xpath("//a[contains(text(),'Welcome Loganayaki13')]"));
		Assert.assertTrue(ele.isDisplayed());
		return new HomePage(driver);
	}

}
