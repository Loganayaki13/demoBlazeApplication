package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class LogoutPage extends ProjectSpecificationMethods {
	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public HomePage finalLogOut() {
		driver.findElement(By.xpath("//a[@id='logout2']")).click();
		return new HomePage(driver);
	}

}
