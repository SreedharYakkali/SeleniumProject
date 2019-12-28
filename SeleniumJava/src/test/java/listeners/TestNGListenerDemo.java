package listeners;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {
	
	@Test
	public void test1(){
		System.out.println("I am inside Test1");
	}
	
	@Test
	public void test2(){
		System.out.println("I am inside Test2");
		//Assert.assertTrue(false);
		String projectPath = System.getProperty("user.dir");
		//System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("Selenium");
		driver.close();
	}
	
	@Test
	public void test3(){
		System.out.println("I am inside Test3");
		throw new SkipException("The test is Skipped");
	}

}
