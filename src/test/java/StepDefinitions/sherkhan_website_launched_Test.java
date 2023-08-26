package StepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import Sherkhan_Core.WebConnector;
import Sherkhans_Util.testUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class sherkhan_website_launched_Test  extends WebConnector{

	
	    WebConnector wc =new WebConnector();
        @Given("^ShareKhan website is open in the browser$")
	    public void sharekhan_website_is_open_in_the_browser() throws Throwable 
	      {	
		    try {
		     //Extent Reports
			 report.startTest("ShareKhan website is open in the browser");
			 report.log(LogStatus.INFO, "ShareKhan website is open in the browser");
		     System.out.println("sharekhan_website_is_open_in_the_browser");
		     app_logs.debug("ShareKhan website is open in the browser");
		    }catch(Throwable t)
		    {
		    report.log(LogStatus.FAIL, "Sharekhan website Functionaltiy Failed");
			testUtil.captureScreenshot("sherkhan_website_launched_Test");
			report.attachScreenshot(testUtil.mailscreenshotpath);
			Assert.assertTrue(false, t.getMessage());	 
		    }
	     }
	
        
	      @Then("^the website is launched successfully$")
	      public void the_website_is_launched_successfully() throws Throwable 
	      {
		  try {
			//Extent Reports
			report.startTest("the website is launched successfully");
			report.log(LogStatus.INFO, "the website is launched successfully");
		   Thread.sleep(2000);
	       System.out.println("the website is launched successfully");
	       app_logs.debug("the website is launched successfully");
		  }catch(Throwable t)
		    {
			  report.log(LogStatus.FAIL, "Sharekhan website Functionaltiy Failed");
			  testUtil.captureScreenshot("sherkhan_website_launched_Test");
			  report.attachScreenshot(testUtil.mailscreenshotpath);
			  Assert.assertTrue(false, t.getMessage());	 
		    }
	      }
	    
	    
	 
	       @When("^user clicks on main menu$")
	       public void user_clicks_on_main_menu() throws Throwable 
	       {
	    	try {
	    	 //Extent Reports
			 report.startTest("user clicks on main menu");
			 report.log(LogStatus.INFO, "user clicks on main menu");
	    	 app_logs.debug("user clicks on main menu");
	    	Thread.sleep(5000);
	    	System.out.println("user clicks on main menu");
	    	WebElement main_menu=driver.findElement(By.xpath(object.getProperty("mainmenu")));
	    	main_menu.click();
	    	System.out.println(main_menu.getText());
	    	Thread.sleep(2000);
	        
	    	 //Trade Button
	    	 Thread.sleep(5000);
	    	 WebElement Trade_Button=driver.findElement(By.xpath(object.getProperty("Trade_Button")));
	    	 System.out.println("Trade is  Displayed : " +Trade_Button.isEnabled());
	    	 System.out.println(Trade_Button.getText());
	    	 Thread.sleep(2000);
	    	 
	         //All Sub Menus
	    	 Thread.sleep(5000);
	    	 WebElement submenus=driver.findElement(By.xpath(object.getProperty("SubMenu")));
	    	 System.out.println(submenus.getText());
	    	 }catch(Throwable t)
		     {
	    	 report.log(LogStatus.FAIL, "Sharekhan website Functionaltiy Failed");
			 testUtil.captureScreenshot("sherkhan_website_launched_Test");
			 report.attachScreenshot(testUtil.mailscreenshotpath);
			 Assert.assertTrue(false, t.getMessage());	 
		    }
	      }
	    

	         @Then("^main menu pop is displayed$")
	         public void main_menu_pop_is_displayed() throws Throwable 
	         {
	    	 try {
	    	  //Extent Reports
			  report.startTest("main menu pop is displayed");
			  report.log(LogStatus.INFO, "main menu pop is displayed");
	         app_logs.debug("main menu pop is displayed");
	         Thread.sleep(5000);
	         System.out.println("main menu pop is displayed"); 
	    	}catch(Throwable t)
		    {
	    	 report.log(LogStatus.FAIL, "Sharekhan website Functionaltiy Failed");
			 testUtil.captureScreenshot("sherkhan_website_launched_Test");
			 report.attachScreenshot(testUtil.mailscreenshotpath);
			 Assert.assertTrue(false, t.getMessage());	 
		    }
	       }
	    
	    

	}
	
	
	
	
	
	
	
	

