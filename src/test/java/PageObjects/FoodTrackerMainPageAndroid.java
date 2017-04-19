package PageObjects;

import java.util.ArrayList;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoodTrackerMainPageAndroid implements FoodTrackerMainPage {
	
    public FoodTrackerMainPageAndroid(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
  
    public MobileElement getAddMenu(){
    	return null;
    }
    
    public MobileElement getEditMenu(){
    	return null;
    }
    
    public List getMenuTable(){
    	return null;
    }

    public List getScreenElements() {
		return null;
    }
    	
    public List<MobileElement> getChildren(MobileElement parent){
		return null;
	}
    
    public String getName(MobileElement element){
    	return null;
    }
    
    public String getTagName(MobileElement element){
    	return null;
    } 
}
