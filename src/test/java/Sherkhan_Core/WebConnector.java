package Sherkhan_Core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;

import StepDefinitions.sherkhan_website_launched_Test;


public class WebConnector {


	public static Properties config =new Properties();
	public static Properties object =new Properties();
	public static FileInputStream fis;
	public static WebDriver driver=null;
	public static Logger app_logs=Logger.getLogger("devpinoyLogger");

	//Extent Reports
	public static ExtentReports report=ExtentReports.get(sherkhan_website_launched_Test.class);
		
	
	 //The constructor is called when an object of a class is created.
	//conturctor ka object jese hi tyar hota he tab sare file ka loading ho jata hai.
	public WebConnector() 
	{
		if (driver==null) 
		{
			
			//loading config prpoerty file
			try {
				fis=new	FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Sherkhan_Config\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//loading object prpoerty file
			try {
				fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Sherkhan_Config\\Object.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				object.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	public void OpenBrowser()
	{
 if(config.getProperty("browser").equals("chrome"))
 {
		System.getProperty("webdriver.chrome.driver", "D:\\Selenium_Drivers\\chromedriver.exe");	
	    driver=new ChromeDriver();
	  
	
 }else 
	  if(config.getProperty("browser").equals("firefox"))
 {
	  System.getProperty("webdriver.gecko.driver", "F:\\GeckoDriver\\geckodriver.exe");	
      driver=new FirefoxDriver();
      
 }

 }
	  
	  
}


	
	
	
	
	
	
