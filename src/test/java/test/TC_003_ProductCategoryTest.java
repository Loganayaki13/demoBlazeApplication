package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_003_ProductCategoryTest extends ProjectSpecificationMethods {

	@BeforeTest
	public void dataSetup() throws IOException {

		testName = "Product page Functionality";
		testDescription = "Testing the product page functionalities";
		testAuthor = "Loganayaki";
	}

	@Test
	public void productTest() throws InterruptedException {

		HomePage obj = new HomePage(driver);

		obj.logInButton().userName("Loganayaki13").passWord("God5n2me!!!").loginButton().validation().ProductPage()
				.menuValtidation().productSelect().clickingCart().logOut();
	}

}
