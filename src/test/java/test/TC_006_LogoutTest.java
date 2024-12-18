package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_006_LogoutTest extends ProjectSpecificationMethods {
	@BeforeTest
	public void dataSetup() throws IOException {
		
		testName = "Logout Functionality";
	    testDescription = "Testing the logout functionalities"; 
	    testAuthor = "Loganayaki"; 
	}
	
	
	@Test
	public void logoutTest() throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.logInButton()
		.userName("Loganayaki13")
		.passWord("God5n2me!!!")
		.loginButton()
		.validation()
		.logoutValidation()
		.finalLogOut();
	}

}
