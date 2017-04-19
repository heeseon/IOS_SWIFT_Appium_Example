package PageObjects;

import java.util.ArrayList;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotoPageIOS implements PhotoPage{
					
	@FindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeButton[1]")
	private MobileElement cameraroll;

	@FindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/*")
	private List<MobileElement> photos;
	
	@FindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[6]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
	private MobileElement alertWindow;
	
    public PhotoPageIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
    public MobileElement getCameraRoll(){
    	return cameraroll;
    }
    
    public List<MobileElement> getPhotos(){
    	return photos;
    }
    
    public MobileElement getAlertWindow(){
    	return alertWindow;
    }
    
    public List getScreenElements() {
    	
    	List<MobileElement> elements = new ArrayList();
    	elements.add(cameraroll);

//    	for(int i = 0 ; i < photos.size() ; ++i)
//    		elements.add(photos.get(i));
    	
		return elements;

    }
	
}
