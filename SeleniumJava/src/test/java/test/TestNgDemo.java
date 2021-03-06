package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNgDemo {

	WebDriver driver = null;
	public static String browserName = null;

	@BeforeTest
	public void setUpTest(){

		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");	
			driver = new ChromeDriver();			
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

	@Test
	public void googleSearch() {

		//Goto Google Page
		driver.get("https://www.google.com/");

		//Enter the text in TextBox
		driver.findElement(By.name("q")).sendKeys("Selenium");

		//click on Search Button
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("btnK")).submit();
	}

	@AfterTest
	public void tearDownTest(){

		driver.close();
		//driver.quit();
		System.out.println("Test Successfully Completed");
		PropertiesFile.setProperties();
	}
}
