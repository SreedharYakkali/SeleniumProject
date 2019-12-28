import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		//caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		
		System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver(caps);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("ABC");
		driver.findElement(By.name("btnK")).submit();
		
		driver.close();
		driver.quit();
	}

}
