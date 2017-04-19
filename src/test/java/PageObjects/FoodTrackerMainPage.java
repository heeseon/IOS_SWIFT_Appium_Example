package PageObjects;

import java.util.List;

import io.appium.java_client.MobileElement;

public interface FoodTrackerMainPage{

	public List<MobileElement> getChildren(MobileElement parent);
    public List getScreenElements();
    public MobileElement getEditMenu();
    public List getMenuTable();
    public MobileElement getAddMenu();
    
}
