package priority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;

public class ApplitoolsDemo {
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		Eyes eyes = new Eyes();
		eyes.setApiKey("l1JM4X092uYCnurOKOjVHwe3FuEsEsoVzmUUM5xj4hk110");
		try{
			
		eyes.open(driver, "Hello World!", "My First Selenium Java", new RectangleSize(800, 600));
		
		driver.get("https://applitools.com/helloworld?diff2");
		
		eyes.checkWindow("Hello!");
		
		driver.findElement(By.tagName("button")).click();
		
		eyes.checkWindow("Click!");
		
		eyes.close();
		}
		finally{
			driver.quit();
			eyes.abortIfNotClosed();
		}
	}
}
