package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class CartFunctionalityPage extends ProjectSpecificationMethods {

	public CartFunctionalityPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public HomePage amout() throws InterruptedException {
		Thread.sleep(5000);
		ele = driver.findElement(By.xpath("//h3[@id='totalp']"));
		Assert.assertTrue(ele.isDisplayed());
		return new HomePage(driver);
	}

}
