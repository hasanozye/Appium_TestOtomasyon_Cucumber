package AppiumTest.utulities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    static String userName = "hasanzyer_mlEPWi";
    static String accessKey = "WMWMJMngQUMapc7mKPsw";

    private Driver() {
    }

    private static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> get() {
        if (driver == null) {
            String platform = ConfigurationReader.get("platform");
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            switch (platform) {
                case "android":

                    // Use Java Client v6.0.0 or above
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("platformName", "android");
                    capabilities.setCapability("platformVersion", "12.0");
                    capabilities.setCapability("deviceName", "Samsung Galaxy S22 Ultra");
                    capabilities.setCapability("app", "bs://e7ae70f80c50222e66f754e694494939ac4d0d6f");


                    try {
                        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), capabilities);
                        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;
                default:

            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}