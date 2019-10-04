package stepdefs;

import core.DriverSingleton;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import element.ConfirmationPopup;
import model.UserFactory;
import org.testng.annotations.AfterTest;
import page.LoginPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ScenarioHooks {

  @Before
  public void beforeScenario() {
    DriverSingleton.getDriver();
  }

  @Given("I open WFR")
  public void iOpenWFR() {
    new LoginPage().open();
  }

  @When("I log in")
  public void iLogIn() {

    Properties property = new Properties();
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("src/main/resources/credentials.properties");
      property.load(fis);
    } catch (IOException e) {
      e.printStackTrace();
    }
    UserFactory.createUser(
        property.getProperty("kronos.username"), property.getProperty("kronos.password"));

    new LoginPage()
        .login(property.getProperty("kronos.username"), property.getProperty("kronos.password"));
  }

  @Then("^I click OK$")
  public void iClickOK() {
    new ConfirmationPopup().clickOkClockButton();
  }

  @After
  public void afterScenario() {
    DriverSingleton.getDriver().manage().deleteAllCookies();
  }

}
