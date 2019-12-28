package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		googleSearch();
	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//Goto Google Page
		driver.get("https://www.google.com/");
		
		//Enter the text in TextBox
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Selenium");
		
		//click on Search Button
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		driver.close();
		System.out.println("Test Successfully Completed");
		
	}
}
