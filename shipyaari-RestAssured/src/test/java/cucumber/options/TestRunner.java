package cucumber.options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		
   features = "src/test/java/features/shipments.feature",
   glue = "StepDefinations",
  // monochrome = true,
  
 
   plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", 
		   "html:target/cucumber-reports/cucumber.html"}
   
)
	
public class TestRunner {
}
