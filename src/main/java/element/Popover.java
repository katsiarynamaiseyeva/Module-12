package element;

import core.UiElement;
import org.openqa.selenium.By;

import static core.DriverSingleton.getDriver;

public class Popover extends UiElement {

  private static final By ADD_NOTE_LOCATOR = By.xpath("//button[text()='Add Notes']");

  public NotesPopup openCommentPopup() {


    driver.findElement(ADD_NOTE_LOCATOR).click();
    return new NotesPopup();
  }
}
