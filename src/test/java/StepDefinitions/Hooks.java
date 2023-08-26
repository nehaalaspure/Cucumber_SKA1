package StepDefinitions;

import java.time.Duration;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import Sherkhan_Core.WebConnector;
import Sherkhans_Util.TestConfig;
import Sherkhans_Util.monitoringMail;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks  extends WebConnector{
	
	WebConnector wc = new WebConnector();

	@Before("@SeleniumTest")
	public void Open_Browser() throws InterruptedException
	{
		 //Extent Reports
		 Thread.sleep(3000);
		 report.init("D:\\Web_Application_SherKhan_Assignments\\SherKhan_Assignments____2\\report.html", true);
		 report.startTest("Opening Browser");

		  Thread.sleep(3000);
		  wc.OpenBrowser();
		  driver.get(config.getProperty("testsite"));
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40L));
		  app_logs.debug("Open_Browser");
	}
	
	
	
	@After("@SeleniumTest")
	public void close_Browser_after_execution() throws AddressException, MessagingException, InterruptedException 
	{
		if(driver!=null)
		Thread.sleep(20000);
		driver.quit();
		Sherkhans_Util.testUtil.zip(System.getProperty("user.dir")+"\\screenshot");
		monitoringMail mail=new monitoringMail();
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
		System.out.println("close Browser after execution"); 
		app_logs.debug("close Browser after execution");
		 
		//Extent Reports
		report.endTest();
		 
	}

}
