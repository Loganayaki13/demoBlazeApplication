package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class SignupPage extends ProjectSpecificationMethods {

	@FindBy(id = "sign-username")
	WebElement user;

	@FindBy(id = "sign-password")
	WebElement password;

	@FindBy(xpath = "//a[@id='signin2']")
	WebElement clickSignupButton;

	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Enter the username
	public SignupPage userName(String name) {
		sendKeysMethod(user, name);
		return this;
	}

	//Enter the password
	public SignupPage passWord(String pass) {
		sendKeysMethod(password, pass);
		return this;
	}

	// click the signUp button
	public HomePage clickSingup() throws InterruptedException {
		ele = driver.findElement(By.xpath("//a[@id='signin2']"));
		Assert.assertTrue(ele.isEnabled(), "Signup button is enabled");
		Thread.sleep(5000);
		clickSignupButton.click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		return new HomePage(driver);
	}
	
	public SignupPage refresh() {
		driver.navigate().refresh();
		return this;
	}

}
