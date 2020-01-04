package priority;

import java.io.IOException;
//import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsDemo {
	
	public static final String USERNAME = "SreedharYakkali";
	public static final String ACCESS_KEY = "dec18554-cf69-4389-bcf2-205c3bd6cb1a";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	
	public static void main(String[] args) throws IOException{
		
		//DesiredCapabilities caps = DesiredCapabilities.chrome();
		ChromeOptions caps = new ChromeOptions();
		caps.setCapability("platform", "Linux");
		caps.setCapability("version", "48.0");
		caps.setCapability("name", "GoogleTest11");
		caps.setCapability("extendedDebugging", "true");
		caps.setCapability("buildNumber", "3.0");
		
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).submit();
		System.out.println(driver.getTitle());
		
		driver.quit();
		System.out.println("Test Completed");
	}

}
