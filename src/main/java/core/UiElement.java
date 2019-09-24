package core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import static core.DriverSingleton.getDriver;

public class UiElement extends RemoteWebElement {

  protected WebDriver driver = DriverSingleton.getDriver();

  protected void highlightElement(By locator) {
    WebElement element = driver.findElement(locator);
    ((JavascriptExecutor) driver)
        .executeScript("arguments[0].style.border='3px solid green'", element);
  }

  protected void unHighlightElement(By locator) {
    ((JavascriptExecutor) driver)
        .executeScript("arguments[0].style.border='0px'", driver.findElement(locator));
  }

  public void highlightElement(WebDriver driver, WebElement element) {
    String bg = element.getCssValue("backgroundColor");
    JavascriptExecutor js = ((JavascriptExecutor) driver);
    js.executeScript("arguments[0].style.backgroundColor = '" + "yellow" + "'", element);
    js.executeScript("arguments[0].style.backgroundColor = '" + bg + "'", element);
  }

  protected void jsElementClick(WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) getDriver();
    js.executeScript("arguments[0].click();", element);
  }
}
