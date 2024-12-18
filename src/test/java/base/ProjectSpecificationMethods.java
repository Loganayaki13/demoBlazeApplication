package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utils.UtilityClass;

public class ProjectSpecificationMethods extends UtilityClass {

	// Launching the browser
	@Parameters({ "browser" })
	@BeforeMethod
	public void LaunchAndLoadURL(String browser) {
		browserLaunch(browser);
	}

	@BeforeSuite
	public void reportInitialization() {
		reptInitilization();
	}

	@AfterSuite
	public void closeReport() {
		extent.flush();
	}

	@BeforeClass
	public void tDetails() {
		details();
	}

	  @AfterMethod 
	  public void closeBrowser() { browserClose(); }
	 
}