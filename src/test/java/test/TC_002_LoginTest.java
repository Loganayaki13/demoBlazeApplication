package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_002_LoginTest extends ProjectSpecificationMethods {

	@BeforeTest()
	public void dataSetup() throws IOException {

		testName = "Login Functionality";
		testDescription = "Testing the login functionality";
		testAuthor = "Loganayaki";
	}

	@BeforeClass
	public void tDetails() {
		details();
	}

	@Test(priority = 0)
	public void loginTest() throws InterruptedException, IOException {
		HomePage obj = new HomePage(driver);

		obj.logInButton().userName("Loganayaki13").passWord("God5n2me!!!").loginButton().validation().logOut();
	}
}
