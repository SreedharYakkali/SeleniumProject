package priority;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {
	
	public static void main(String[] args) {
		
		seleniumWaits();
	}
	
	public static void seleniumWaits(){
		
	String projectPath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Selenium");
	driver.findElement(By.name("btnK")).submit();
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdf")));
	
	driver.findElement(By.name("abcd")).click();
	
	driver.close();
	driver.quit();
	}
}
