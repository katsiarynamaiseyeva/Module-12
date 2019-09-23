package page;

import element.ConfirmationPopup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DashboardPage extends AbstractPage {

  private static final By CLOCK_LOCATOR =
      By.xpath("//button[@class='time-clock-button' and @data-type='PUNCH']");
  private static final By CLOCK_OUT_LOCATOR = By.xpath("//*[@data-type='PUNCH_OUT']");

  public DashboardPage(WebDriver driver) {
    super();
  }

  public ConfirmationPopup punchIn() {
    driver.findElement(CLOCK_LOCATOR).click();
    return new ConfirmationPopup();
  }

  public ConfirmationPopup punchOut() {
    driver.findElement(CLOCK_OUT_LOCATOR).click();
    return new ConfirmationPopup();
  }

  public HamburgerMenu navigateToHamburgerMenu(String hamburgerButton) {
    return new HamburgerMenu();
  }
}
