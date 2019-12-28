package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test = extent.createTest("Google Search Test One", "This is a test to validate google search functionality");

		String projectPath = System.getProperty("user.dir");
		//System.out.println(projectPath);
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver(caps);
		
		test.log(Status.INFO, "Starting Test Case");
		
		driver.get("https://www.google.com/");	
		test.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		test.pass("Entered text in Searchbox");
		
		driver.findElement(By.name("btnK")).submit(); // Working
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);//Not Working
		//driver.findElement(By.className("gNO89b")).submit(); // Working
		test.pass("Pressed Keyboard enter key");
		
		driver.close();
		driver.quit();
		test.pass("Closed the Browser");
		
		test.pass("Test Completed");
		
		// calling flush writes everything to the log file
        extent.flush();
	}

}
