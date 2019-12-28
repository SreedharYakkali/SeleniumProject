package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		
		googleSearch();
	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Goto Google Page
		driver.get("https://www.google.com/");
		
		//Enter the text in TextBox
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//click on Search Button
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("btnK")).submit();
		
		driver.close();
		System.out.println("Test Successfully Completed");
		
	}
}
