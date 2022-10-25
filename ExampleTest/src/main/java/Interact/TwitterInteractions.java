package Interact;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class TwitterInteractions extends TwitterBase {

    public TwitterInteractions(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void tapInAdd() {
        driver.findElement(MobileBy.id("br.com.suacifra:id/addBottomNavigation")).click();
    }

    public boolean seeAddScreen() {
        return driver.findElement(MobileBy.id("br.com.suacifra:id/addCifraTitleTextView")) != null;
    }
}
