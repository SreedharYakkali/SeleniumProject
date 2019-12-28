package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNgDemo;

public class PropertiesFile {

	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();

	}

	public static void getProperties(){
		try {
			//System.out.println(projectPath);

			InputStream input = new FileInputStream(projectPath+"/src/test/java/config/config.properties");
			try {
				prop.load(input);
				String browser = prop.getProperty("browser");
				System.out.println(browser);
				TestNgDemo.browserName=browser;
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	public static void setProperties()
	{
		try {
			OutputStream output = new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
			//prop.setProperty("browser", "chrome");
			prop.setProperty("result", "pass");
			try {
				prop.store(output, null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}  
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

}
