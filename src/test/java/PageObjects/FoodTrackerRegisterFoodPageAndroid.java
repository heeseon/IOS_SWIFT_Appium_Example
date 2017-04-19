package PageObjects;

import java.util.ArrayList;
import java.util.List;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoodTrackerRegisterFoodPageAndroid implements FoodTrackerRegisterFoodPage{

    public FoodTrackerRegisterFoodPageAndroid(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
    public List<MobileElement> getScreenElements() {
		return null;
    }
    
    public MobileElement getCancel(){
    	return null;
    }
	
    public MobileElement getSave(){
    	return null;
    }  
    
    public MobileElement getFoodname(){
    	return null;
    } 
    
    public List<MobileElement> getFoodscore(){
    	return null;
    }

	public MobileElement getFoodimage() {
		// TODO Auto-generated method stub
		return null;
	} 
    
}
