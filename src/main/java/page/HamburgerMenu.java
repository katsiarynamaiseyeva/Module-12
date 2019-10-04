package page;

import org.openqa.selenium.By;

public class HamburgerMenu extends AbstractPage {

  private static final By HAMBURGER_MENU_BUTTON_LOCATOR = By.xpath("//*[@id='mainMenuBtn']");
  private static final By TEAM_BUTTON_LOCATOR = By.xpath("//button[@title='Team']");
  private static final By HR_BUTTON_LOCATOR = By.xpath("//button[@aria-label='HRsection']");
  private static final By FORMS_BUTTON_LOCATOR =
      By.xpath("//button[@aria-label='HR - Formssection']");
  private static final By OTHER_FORMS_BUTTON_LOCATOR =
      By.cssSelector("#tab-manager [aria-label='Forms - Other Forms']");

  public OtherFormsPage navigateToForms() {
    highlightElement(driver, driver.findElement(HAMBURGER_MENU_BUTTON_LOCATOR));
    driver.findElement(HAMBURGER_MENU_BUTTON_LOCATOR).click();
    jsElementClick(driver.findElement(TEAM_BUTTON_LOCATOR));
    driver.findElement(HR_BUTTON_LOCATOR).click();
    driver.findElement(FORMS_BUTTON_LOCATOR).click();
    driver.findElement(OTHER_FORMS_BUTTON_LOCATOR).click();
    return new OtherFormsPage();
  }
}
