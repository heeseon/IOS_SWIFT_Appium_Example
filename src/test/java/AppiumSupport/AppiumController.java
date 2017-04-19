package AppiumSupport;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumController {

    public static OS executionOS = OS.IOS;

    public enum OS {
        ANDROID,
        IOS
    }
    public static AppiumController instance = new AppiumController();
    public static AppiumDriver driver;

    public void start() throws MalformedURLException {
        if (driver != null) {
            return;
        }
        switch(executionOS){
        	
            case ANDROID:
                break;
            case IOS:
                File classpathRoot = new File(System.getProperty("user.dir"));
                File appDir = new File("/", "/Users/hwangheeseon/Library/Developer/Xcode/DerivedData/FoodTracker-eesrwojtljoixdbhqrhzrprvqmbo/Build/Products/Debug-iphonesimulator");
                File app = new File(appDir, "FoodTracker.app");
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities = new DesiredCapabilities();
                capabilities.setCapability("automationName", "XCUITest");
                capabilities.setCapability("platformName", "ios");
                capabilities.setCapability("deviceName", "iPhone 6");
                capabilities.setCapability("app", app.getAbsolutePath());
                driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                break;
        }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
