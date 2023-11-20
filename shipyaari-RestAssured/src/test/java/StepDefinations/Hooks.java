//package StepDefinations;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import resources.TestDataBuild;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.plugin.Plugin;
//import io.cucumber.plugin.event.EventPublisher;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.runner.RunWith;
//
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//    // your Cucumber options here
//)
//
//public class Hooks {
//
//
//	    private static HtmlReporter htmlReporter;
//
//	    @BeforeClass
//	    public static void setup() throws IOException {
//	        htmlReporter = new HtmlReporter();
//	    }
//
//	    @AfterClass
//	    public static void teardown() throws IOException {
//	        htmlReporter.finishReport();
//	    }
//
//	    @AfterClass
//	    public static void generateReport() throws IOException {
//	        List<String> jsonFiles = new ArrayList<>();
//	        jsonFiles.add("target/cucumber-report.json"); // Path to your generated Cucumber JSON report
//
//	        Plugin htmlReport = htmlReporter;
//	        EventPublisher publisher = htmlReporter.getTestSourcesModel().getEventPublisher();
//	        htmlReport = htmlReport.forPublishers(publisher);
//	        htmlReport.generateReports();
//	        htmlReporter.finishReport();
//	    }
//	}
//}
