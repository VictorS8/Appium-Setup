package Interact;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public abstract class TwitterConfig extends AbstractTestNGCucumberTests {

    public static AndroidDriver<MobileElement> driver;

    public abstract String getName();
    @BeforeTest
    public abstract void setUpPage();

    @BeforeSuite
    public void setUpAppium() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Galaxy J6 de joao");
        capabilities.setCapability("udid", "520026abb85c7591");
        capabilities.setCapability("appPackage", "br.com.suacifra");
        capabilities.setCapability("appActivity", "br.com.suacifra.MainActivity");
        capabilities.setCapability("platformName", "Android");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        // set default timeout wait time to get element from screen
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void tearDownAppium() {
        driver.quit();
    }

    @BeforeClass
    public void navigateTo() throws InterruptedException {
        // navigationPage.gotoCategory(getName());
    }

    @AfterClass
    public void restartApp() {
        driver.resetApp();
    }

}
