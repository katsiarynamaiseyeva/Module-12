package stepdefs;

import core.DriverSingleton;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterSuite;

@CucumberOptions(
    strict = true,
    features = "src/test/resources/features",
    plugin = {"json:target/cucumber-report.json", "html:target/cucumber-report"})
public class CucumberRunner extends AbstractTestNGCucumberTests {

  @AfterSuite
  public void afterTest() {
    DriverSingleton.getDriver().quit();
  }
}
