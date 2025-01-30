package co.com.holafly.utilities;

import io.appium.java_client.AppiumDriver;
import java.net.URL;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.annotations.Managed;
import org.openqa.selenium.remote.DesiredCapabilities;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MyDriver {

  @Managed(driver = "appium")
  private static AppiumDriver driver;

  public static AppiumDriver getDriverAppium() {
    return driver;
  }

  @SneakyThrows
  public static AppiumDriver mobile() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("appium:platformName", "Android");
    capabilities.setCapability("appium:appActivity", "com.swaglabsmobileapp.MainActivity");
    capabilities.setCapability("appium:appPackage", "com.swaglabsmobileapp");
    capabilities.setCapability("appium:automationName", "UiAutomator2");
    capabilities.setCapability("appium:autoGrantPermissions", "true");
    capabilities.setCapability("appium:noReset", "false");
    capabilities.setCapability("appium:autoDismissAlerts", "true");
    capabilities.setCapability("appium:appWaitDuration", "80000");
    capabilities.setCapability(
        "appium:app",
        "https://github.com/saucelabs/sample-app-mobile/releases/download/2.7.1/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
    driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    return driver;
  }
}
