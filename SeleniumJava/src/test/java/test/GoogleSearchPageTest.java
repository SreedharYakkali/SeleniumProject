package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;
	
    public static void main(String[] args) {
		
		googleSearch();
	}
    
    public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
    
        driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObject = new GoogleSearchPageObjects(driver);
		
		//Goto Google Page
		driver.get("https://www.google.com/");
		
		searchPageObject.setTextInSearchBox("Selenium");
		
		searchPageObject.clickSearchButton();
		
		driver.close();
    
    }
}