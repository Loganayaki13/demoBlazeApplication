package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods {

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public SignupPage signUpButton() {
		ele = driver.findElement(By.linkText("Sign up"));
		Assert.assertTrue(ele.isDisplayed(), "SignUp link is displayed");
		driver.findElement(By.id("signin2")).click();
		return new SignupPage(driver);
	}

	public LoginPage logInButton() {
		driver.findElement(By.id("login2")).click();
		return new LoginPage(driver);
	}

	public CartFunctionalityPage clickCart() {
		driver.findElement(By.xpath("//a[@id='cartur']")).click();
		return new CartFunctionalityPage(driver);
	}

	public PurchaseFunctionPage placeOrder() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='cartur']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		return new PurchaseFunctionPage(driver);
	}

	public ProductCategoryPage ProductPage() {
		ele = driver.findElement(By.xpath("(//a[@class='list-group-item'])[3]"));
		Assert.assertTrue(ele.isDisplayed());
		return new ProductCategoryPage(driver);
	}

	public LogoutPage logoutValidation() {
		ele = driver.findElement(By.id("logout2"));
		Assert.assertTrue(ele.isEnabled());
		return new LogoutPage(driver);
	}

	public HomePage logOut() {
		driver.findElement(By.xpath("//a[@id='logout2']")).click();
		return new HomePage(driver);
	}

}
