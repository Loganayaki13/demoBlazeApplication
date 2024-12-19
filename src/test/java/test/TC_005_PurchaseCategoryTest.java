package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_005_PurchaseCategoryTest extends ProjectSpecificationMethods {

	@BeforeTest
	public void dataSetup() throws IOException {

		testName = "Purchase Functionality";
		testDescription = "Testing the purchase functionalities";
		testAuthor = "Loganayaki";
	}

	@Test
	public void purchaseTest() throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.logInButton().userName("Loganayaki13").passWord("God5n2me!!!").loginButton().validation().placeOrder()
				.cName().cCountry().cCity().cardNumber().cardmonth().cardYear().clickPurchase().clickOkbutton()
				.logOut();
	}
}
