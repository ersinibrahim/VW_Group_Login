package runners;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(

        tags = {"@SmokeTest"},
        features = {"src/test/java/featureFiles"},
        glue = {"stepDefinitions"},
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}


)

public class Runner_ExtentReport extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void afterClass(){

        Reporter.loadXMLConfig("src/test/java/XMLFiles/ExtentReportSet.xml");
        Reporter.setSystemInfo("User Name", "ERSIN");
        Reporter.setSystemInfo("Application Name","VW Group Website");
        Reporter.setSystemInfo("Operation System Info", System.getProperty("os.name").toString());
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }



}
