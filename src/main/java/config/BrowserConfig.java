package config;

public class BrowserConfig {
  private static BrowserType browserType = BrowserType.CHROME;
  private static String seleniumServerUrl = "http://127.0.0.1:4444/wd/hub";

  public static BrowserType getBrowserType() {
    return browserType;
  }

  public static void setBrowserType(BrowserType type) {
    browserType = type;
  }

  public static String getSeleniumServerUrl() {
    return seleniumServerUrl;
  }

  public static void setSeleniumServerUrl(String url) {
    seleniumServerUrl = url;
  }
}
