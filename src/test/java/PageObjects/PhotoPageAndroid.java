package PageObjects;

import java.util.ArrayList;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotoPageAndroid implements PhotoPage{
						
    public PhotoPageAndroid(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
    public MobileElement getCameraRoll(){
    	return null;
    }
    
    public List<MobileElement> getPhotos(){
    	return null;
    }
    
    public MobileElement getAlertWindow(){
    	return null;
    }
    
    public List getScreenElements() {
		return null;
    }
	
}
