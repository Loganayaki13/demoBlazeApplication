package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class PurchaseFunctionPage extends ProjectSpecificationMethods {

	public PurchaseFunctionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "name")
	WebElement name;

	@FindBy(id = "country")
	WebElement country;

	@FindBy(id = "city")
	WebElement city;

	@FindBy(id = "card")
	WebElement creditCard;

	@FindBy(id = "month")
	WebElement month;

	@FindBy(id = "year")
	WebElement year;

	@FindBy(xpath = "//button[contains(text(),'Purchase')]")
	WebElement purchase;

	@FindBy(xpath = "//button[contains(@class,'confirm btn btn-lg btn-primary')]")
	WebElement clickOkButton;

	public PurchaseFunctionPage cName() {
		name.sendKeys("Logu");
		return this;
	}

	public PurchaseFunctionPage cCountry() {
		country.sendKeys("USA");
		return this;
	}

	public PurchaseFunctionPage cCity() {
		city.sendKeys("Texas");
		return this;
	}

	public PurchaseFunctionPage cardNumber() {
		creditCard.sendKeys("1234567890987654");
		return this;
	}

	public PurchaseFunctionPage cardmonth() {
		month.sendKeys("Mar");
		return this;
	}

	public PurchaseFunctionPage cardYear() throws InterruptedException {
		year.sendKeys("2025");
		Thread.sleep(5000);
		return this;
	}

	public PurchaseFunctionPage clickPurchase() throws InterruptedException {
		purchase.click();
		Thread.sleep(5000);
		return this;
	}

	public HomePage clickOkbutton() throws InterruptedException {
		clickOkButton.click();
		Thread.sleep(5000);
		return new HomePage(driver);
	}

}
