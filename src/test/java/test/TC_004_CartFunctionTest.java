package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_004_CartFunctionTest extends ProjectSpecificationMethods {

	@BeforeTest
	public void dataSetup() throws IOException {

		testName = "Cart Functionality";
		testDescription = "Testing the cart functionalities";
		testAuthor = "Loganayaki";
	}

	@BeforeClass
	public void tDetails() {
		details();
	}

	@Test
	public void cartTest() throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.logInButton().userName("Loganayaki13").passWord("God5n2me!!!").loginButton().validation().clickCart()
				.amout().logOut();
	}
}
