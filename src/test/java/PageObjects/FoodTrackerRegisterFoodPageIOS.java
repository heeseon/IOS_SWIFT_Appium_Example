package PageObjects;

import java.util.ArrayList;
import java.util.List;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoodTrackerRegisterFoodPageIOS implements FoodTrackerRegisterFoodPage{

	@FindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
	private MobileElement cancel;

	@FindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
	private MobileElement save;
	
	@FindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	private MobileElement foodname;
	
	@FindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeImage[1]")
	private MobileElement foodimage;
	
	@FindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/*")
	private List<MobileElement> foodscore;
	
	
    public FoodTrackerRegisterFoodPageIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
    public List<MobileElement> getScreenElements() {
    	
    	List<MobileElement> elements = new ArrayList();
    	elements.add(cancel);
    	elements.add(save);
    	elements.add(foodname);
    	elements.add(foodimage);
    	for(int i = 0 ; i < foodscore.size() ; ++i)
    		elements.add(foodscore.get(i));
    	
		return elements;

    }
    
    public MobileElement getCancel(){
    	return cancel;
    }
	
    public MobileElement getSave(){
    	return save;
    }  
    
    public MobileElement getFoodname(){
    	return foodname;
    } 
    
    public List<MobileElement> getFoodscore(){
    	return foodscore;
    }

	public MobileElement getFoodimage() {
		// TODO Auto-generated method stub
		return foodimage;
	} 
    
}
