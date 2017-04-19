package PageObjects;

import io.appium.java_client.MobileElement;

import java.util.List;

public interface FoodTrackerRegisterFoodPage {
	public List<MobileElement> getScreenElements();
    public MobileElement getCancel();
    public MobileElement getSave();
    public MobileElement getFoodname();
    public MobileElement getFoodimage();
    public List<MobileElement> getFoodscore();
}
