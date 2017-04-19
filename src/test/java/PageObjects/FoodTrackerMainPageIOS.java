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

public class FoodTrackerMainPageIOS implements FoodTrackerMainPage {
	
    public FoodTrackerMainPageIOS(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
  
    @FindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[1]")
    private MobileElement editmenu;

    @FindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
    private MobileElement addmenu;

    @FindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/*")
    private List<MobileElement> menutable;
    
    public MobileElement getAddMenu(){
    	return addmenu;
    }
    
    public MobileElement getEditMenu(){
    	return editmenu;
    }
    
    public List getMenuTable(){
    	return menutable;
    }

    public List getScreenElements() {
    	
    	List<MobileElement> elements = new ArrayList();
    	elements.add(editmenu);
    	elements.add(addmenu);
    	for(int i = 0 ; i < menutable.size() ; ++i)
    		elements.add(menutable.get(i));
    	
		return elements;

    }
    	
    public List<MobileElement> getChildren(MobileElement parent){
		return parent.findElements(By.xpath("//*"));
	}
    
    public String getName(MobileElement element){
    	return element.getText();
    }
    
    public String getTagName(MobileElement element){
    	return element.getTagName();
    } 
}
