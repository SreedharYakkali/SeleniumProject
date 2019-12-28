package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo1 {

	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest(){
		
		String projectPath = System.getProperty("user.dir");
		//System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");	
		driver = new ChromeDriver();	
	}
	
	@Test
	public void googleSearch2() {
		
		//Goto Google Page
		driver.get("https://www.google.com/");
		
		//Enter the text in TextBox
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//click on Search Button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);	
	}
	
	@Test
	public void googleSearch3() {
		
		//Goto Google Page
		driver.get("https://www.google.com/");
		
		//Enter the text in TextBox
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//click on Search Button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);	
	}
	
	@AfterTest
	public void tearDownTest(){
		
		driver.close();
		driver.quit();
		System.out.println("Test Successfully Completed");
	}
}
