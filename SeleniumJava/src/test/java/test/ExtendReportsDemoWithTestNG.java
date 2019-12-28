package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsDemoWithTestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		htmlReporter = new ExtentHtmlReporter("extentReportsTestNG.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@BeforeTest
	public void setUpTest(){
		
		String projectPath = System.getProperty("user.dir");
		//System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");	
		driver = new ChromeDriver();	
	}
	
	@Test
	public void test1() throws Exception
	{
		ExtentTest test = extent.createTest("Google Search Test One", "This is a test to validate google search functionality");
		
		driver.get("https://www.google.com/");	
		test.pass("Navigated to google.com");
		
		test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());	
        test.addScreenCaptureFromPath("screenshot.png");	
	}
	
	@Test
	public void test2() throws Exception
	{
		ExtentTest test = extent.createTest("Google Search Test Second", "This is a test to validate google search functionality");
		
		driver.get("https://www.google.com/");	
		test.pass("Navigated to google.com");
		
		test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());	
        test.addScreenCaptureFromPath("screenshot.png");	
	}

	@AfterTest
	public void tearDownTest(){
		
		driver.close();
		driver.quit();
		System.out.println("Test Successfully Completed");
	}
	
	@AfterSuite
	public void tearDown()
	{
		extent.flush();
	}

}
