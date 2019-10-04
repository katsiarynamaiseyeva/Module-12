package stepdefs;

import cucumber.api.java.en.And;
import page.DashboardPage;

public class PunchInStepDefs {

  @And("I punched in")
  public void iPunchedIn() {
    new DashboardPage().punchIn();
  }
}
