package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_001_SignUpTest extends ProjectSpecificationMethods {
	
	@BeforeTest 
	public void data() throws IOException { 
	
		testName = "SignUp Functionality";
	    testDescription = "Testing the SignUp functionality"; 
	    testAuthor = "Loganayaki"; 
	}
	@BeforeClass
	public void tDetails() {
		details();
	}
	
	@Test
	public void signuUpTest() throws InterruptedException, IOException {
		HomePage obj = new HomePage(driver);
		obj.signUpButton()
		.userName("Loganayaki")
		.passWord("123456")
		.refresh()
		.clickSingup();
	}

}
