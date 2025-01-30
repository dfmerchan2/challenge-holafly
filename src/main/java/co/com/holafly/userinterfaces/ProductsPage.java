package co.com.holafly.userinterfaces;

import io.appium.java_client.AppiumBy;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductsPage {
    public static final Target LBL_PRODUCTS = Target.the("Title Products")
            .locatedForAndroid(By.xpath("//*[@content-desc='test-Cart drop zone']//android.widget.TextView"))
            .locatedForIOS(AppiumBy.accessibilityId("test-Username"));
}
