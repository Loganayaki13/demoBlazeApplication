package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.HomePage;

public class UtilityClass {
	public static WebDriver driver;
	public static WebElement ele;
	public static String expectedResult;
	public static String actualResult;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName, testDescription, testAuthor;

	public void browserLaunch(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} 

		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	public void browserClose() {
		driver.close();
	}

	public void sendKeysMethod(WebElement ele, String input) {
		ele.sendKeys(input);
	}

	public void reptInitilization() {
		String path = "C:\\Users\\Asus\\eclipse-workspace\\JAT-MiniProject-1-Version-1\\report\\DemoBlazeApp\\DemoBlaze_App.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("DemoBlaze Application");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	public void details() {
		test = extent.createTest(testName, testDescription);
		test.assignAuthor(testAuthor);
	}

	public String screenShot(String name) throws IOException {
		String path = "C:\\Users\\Asus\\eclipse-workspace\\JAT-MiniProject-1-Version-1\\Snaps\\" + name + ".png";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
		return path;
	}

	public HomePage logOut() {
		driver.findElement(By.xpath("//a[contains(@id,'logout2')]")).click();
		return new HomePage(driver);
	}

}
