package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class ProductCategoryPage extends ProjectSpecificationMethods{

	public ProductCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[contains(@class,'nav-link')])[1]")
	WebElement home;
	
	@FindBy(xpath="(//a[contains(@class,'nav-link')])[2]")
	WebElement contact;
	
	@FindBy(xpath="(//a[contains(@class,'nav-link')])[3]")
	WebElement aboutus;
	
	@FindBy(xpath="(//a[contains(@class,'list-group-item')])[2]")
	WebElement phones;
	
	@FindBy(xpath="(//a[contains(@class,'list-group-item')])[3]")
	WebElement laptops;
	
	@FindBy(xpath="(//a[contains(@class,'list-group-item')])[4]")
	WebElement monitors;
	
	@FindBy(xpath="//a[contains(text(),'Sony vaio i5')]")
	WebElement product;
	
	@FindBy(xpath="(//a[@class='list-group-item'])[3]")
	WebElement laptopClick;
	
	@FindBy(linkText="Cart")
	WebElement cart;
	
	
	public ProductCategoryPage menuValtidation() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Assert.assertTrue(home.isDisplayed());		
		Assert.assertTrue(phones.isDisplayed());
		Assert.assertTrue(laptops.isDisplayed());
		Assert.assertTrue(contact.isDisplayed());
		Assert.assertTrue(aboutus.isDisplayed());
		Assert.assertTrue(monitors.isDisplayed());
		return this;
	}
	
	
	public ProductCategoryPage productSelect() throws InterruptedException {
		Thread.sleep(5000);
		laptopClick.click();
		product.click();
		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		driver.navigate().back();
		driver.navigate().back();
		return this;
	}
	
    //opening the cart
    public HomePage clickingCart() throws InterruptedException {
    	Thread.sleep(5000);
    	cart.click();
    	ele=driver.findElement(By.xpath("//td[contains(text(),'Sony vaio i5')]"));
    	Assert.assertTrue(ele.isDisplayed());
    	return new HomePage(driver);
    	
    }
}
