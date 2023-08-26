package CucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//    2.To verify that when user clicks on Main Menu(as shown below-Image 1)
//      button, main menu popup is displayed on right side(refer Image 2).


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features/",
                 glue="StepDefinitions",
                 plugin={"pretty","html:target/cucumber"} ,
                 monochrome=true, strict=true
		        )
public class TestRunner extends AbstractTestNGCucumberTests{

}

	
	
	
	
	
	
