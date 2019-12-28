import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
		
		//WebDriver driver = new FirefoxDriver(); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//driver.findElement(By.className("gNO89b")).submit();
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		
		List<WebElement> listOfElements = driver.findElements(By.xpath("//input"));
		int count = listOfElements.size();
		System.out.println("Count Of No.OF inputs : "+count);
		
		//WebElement textBox = driver.findElement(By.xpath("//input[@name='q']"));
		//textBox.sendKeys("Selenium");
		//WebDriver driver = new InternetExplorerDriver();
		//driver.get("https://selenium.dev/");
		
		Thread.sleep(3000);
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		driver.close();
		//driver.quit();
	}
}