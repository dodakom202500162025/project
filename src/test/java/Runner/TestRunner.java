package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            features = "src/main/resources/Features",
            glue = {"StepDefinition"},
            plugin = {"html:target/cucumber-reports.html",
                    "json:target/cucumber-report.json"},
            tags = "@PurchaseProduct"
    )

    public class TestRunner extends AbstractTestNGCucumberTests {


    }


