package Test;

import AppiumSupport.AppiumBaseClass;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import AppiumSupport.AppiumController;
import PageObjects.FoodTrackerMainPage;
import PageObjects.FoodTrackerMainPageIOS;
import PageObjects.FoodTrackerRegisterFoodPage;
import PageObjects.FoodTrackerRegisterFoodPageIOS;
import PageObjects.PhotoPage;
import PageObjects.PhotoPageIOS;

public class BaseTestClass extends AppiumBaseClass{
    protected static FoodTrackerMainPage mainPage;
    protected static FoodTrackerRegisterFoodPage registerMenuPage;
    protected static PhotoPage photoPage;
    
    public static final int NEEDS_NETWORK_DELAY = 1;
    public static final int NEEDS_SWITCH_SCREEN_DELAY = 2000;

    @BeforeClass
    public static void setUp() throws Exception {
        AppiumController.instance.start();
        switch (AppiumController.executionOS) {
            case ANDROID:
                break;
            case IOS:
                mainPage = new FoodTrackerMainPageIOS(driver());
                registerMenuPage = new FoodTrackerRegisterFoodPageIOS(driver());
                photoPage = new PhotoPageIOS(driver());
                break;
        }
    }

    @AfterClass
    public static void tearDown() {
        AppiumController.instance.stop();
    }
}
