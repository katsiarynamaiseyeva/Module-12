package stepdefs;

import cucumber.api.java.en.And;
import page.DashboardPage;

public class PunchOutStepDefs {

  @And("I punched out")
  public void iPunchedOut() {
    new DashboardPage().punchOut();
  }
}
