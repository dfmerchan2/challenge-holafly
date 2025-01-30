package co.com.holafly.userinterfaces;

import io.appium.java_client.AppiumBy;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class LoginPage extends PageObject {

  public static final Target TXT_USER =
      Target.the("Input Username")
          .locatedForAndroid(AppiumBy.accessibilityId("test-Username"))
          .locatedForIOS(AppiumBy.accessibilityId("test-Username"));

  public static final Target TXT_PASSWORD =
      Target.the("Input Password")
          .locatedForAndroid(AppiumBy.accessibilityId("test-Password"))
          .locatedForIOS(AppiumBy.accessibilityId("test-Password"));

  public static final Target BTN_LOGIN =
      Target.the("Button Login")
          .locatedForAndroid(By.xpath("//android.widget.TextView[@text='LOGIN']"))
          .locatedForIOS(AppiumBy.accessibilityId("LOGIN"));

  public static final Target LBL_ERROR_MESSAGE =
      Target.the("Error message")
          .locatedForAndroid(
              By.xpath("//*[@content-desc='test-Error message']//android.widget.TextView"))
          .locatedForIOS(AppiumBy.accessibilityId("test-Error message"));
}
