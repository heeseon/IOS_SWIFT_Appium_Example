package Test;

import java.util.List;

import io.appium.java_client.MobileElement;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;


public class Test_FoodTracker extends BaseTestClass {

    @Test
    public void test_01() {//_displayMainPage

    	waitfor(NEEDS_SWITCH_SCREEN_DELAY);
    	
    	//get elements that composed this page
        List<MobileElement> list = mainPage.getScreenElements();
        
        //Verify result which all elements exist
        for(int i = 0 ; i < list.size() ; ++i )
        	Assert.assertNotNull(list.get(i).getId());

    }
    
    @Test
    public void test_02() {//_displayEditImages
        
    	//click editmenu btn
        MobileElement editBtn = mainPage.getEditMenu();
        editBtn.click();
        
        waitfor(NEEDS_SWITCH_SCREEN_DELAY);
        
        List<MobileElement> after = mainPage.getMenuTable();
        
        for(int i = 0 ; i < after.size() ; ++ i) {
        	//get the menu
        	MobileElement menu = after.get(i);
        	//get element's children
        	List<MobileElement> children = mainPage.getChildren(menu);
        	//get children's first element
        	MobileElement element = children.get(0);
        	//get element's name 
        	String name = element.getText();
        	System.out.println("text = " + name);
        	//verify that the delete sub menu is displayed
        	Assert.assertTrue(name.startsWith("Delete"));
        }
        
      //click editmenu btn
        editBtn.click();
        
        waitfor(NEEDS_SWITCH_SCREEN_DELAY);
        
        after = mainPage.getMenuTable();
        
        for(int i = 0 ; i < after.size() ; ++ i) {
        	//get the menu
        	MobileElement menu = after.get(i);
        	//get element's children
        	List<MobileElement> children = mainPage.getChildren(menu);
        	//get children's first element
        	MobileElement element = children.get(0);
        	//get element's name 
        	String name = element.getText();
        	System.out.println("text = " + name);
        	//verify that the delete sub menu is displayed
        	Assert.assertFalse(name.startsWith("Delete"));
        }
        
    }
    
    @Test
    public void test_03() {//_deleteAllFoods

    	MobileElement editMenu = mainPage.getEditMenu();
    	
    	editMenu.click();
    
        List<MobileElement> after = mainPage.getMenuTable();
        int size = after.size();
        
        waitfor(NEEDS_SWITCH_SCREEN_DELAY);

        while( size > 0) {
        	//get the menu
        	MobileElement menu = after.get(0);
        	//get element's children
        	List<MobileElement> children = mainPage.getChildren(menu);
        	//get children's first element
        	MobileElement element = children.get(0);
        	//get element's name 
        	String name = element.getText();
        	//click '-' btn
        	if(name.startsWith("Delete"))
        		element.click();
        	
        	
            waitfor(NEEDS_SWITCH_SCREEN_DELAY);
            
    		children = mainPage.getChildren(menu);
        	MobileElement delete = children.get(children.size()-1);
        	
        	//click the Delete btn
        	delete.click();

        	waitfor(NEEDS_SWITCH_SCREEN_DELAY);
        	
        	after = mainPage.getMenuTable();
       	
        	//verify that a food is deleted        	
        	Assert.assertEquals(size, after.size()+1);
        	
        	size = after.size();
	
        }
    }
    
    @Test
    public void test_04() {//_DisplayPhotoPage
    	
    	 //click + btn
    	 MobileElement addBtn = mainPage.getAddMenu();
    	 addBtn.click();
    	 
     	waitfor(NEEDS_SWITCH_SCREEN_DELAY);
    	
     	List<MobileElement> list = registerMenuPage.getScreenElements();
     	
     	//Verify result which all elements exist
     	for(int i = 0 ; i < list.size() ; ++i )
     		Assert.assertNotNull(list.get(i).getId());
     	
    }
    
    @Test
    public void test_05() {//_register20Foods
    	int imageNum = 0;
    	int scoreNum = 0;
    	List<MobileElement> list ;
    	int k = 0 ;
    	while( k < 20 ){
    		
        	MobileElement name = registerMenuPage.getFoodname();
        	
        	name.sendKeys("test" + k++);
        	
        	waitfor(NEEDS_SWITCH_SCREEN_DELAY);
        	
        	this.driver().hideKeyboard();
        	
        	waitfor(NEEDS_SWITCH_SCREEN_DELAY);
        	
        	MobileElement image = registerMenuPage.getFoodimage();
        	image.click();
        	waitfor(NEEDS_SWITCH_SCREEN_DELAY); 
        	
        	
        	MobileElement alertWindow = photoPage.getAlertWindow();

        	try {
            	if(alertWindow != null && alertWindow.getId() != null){
            		alertWindow.click();
            		waitfor(NEEDS_SWITCH_SCREEN_DELAY); 
            	}        		
        	}catch(Exception e){
        		
        	}
        	
        	list = photoPage.getScreenElements();
    	 
        	//Verify result which all elements exist
        	for(int i = 0 ; i < list.size() ; ++i )
        		Assert.assertNotNull(list.get(i).getId());
        	
        	MobileElement cameraroll = photoPage.getCameraRoll();
        	cameraroll.click();
        	
        	waitfor(NEEDS_SWITCH_SCREEN_DELAY); 
        	
        	list = photoPage.getPhotos();
        	
        	if(imageNum == list.size())
        		imageNum = 0;
        	
        	MobileElement photo = list.get(imageNum ++);
        	photo.click();
        	
        	waitfor(NEEDS_SWITCH_SCREEN_DELAY); 
        	
        	List<MobileElement> scores = registerMenuPage.getFoodscore();
        	
        	if(scoreNum == scores.size())
        		scoreNum = 0;
        	
        	MobileElement score = scores.get(scoreNum++);
        	score.click();

        	waitfor(NEEDS_SWITCH_SCREEN_DELAY); 
        	
        	
        	MobileElement save = registerMenuPage.getSave();
        	save.click();

        	waitfor(NEEDS_SWITCH_SCREEN_DELAY * k); 
        	
        	if(k < 20){
       	 		MobileElement addBtn = mainPage.getAddMenu();
       	 		addBtn.click();
       	 
       	 		waitfor(NEEDS_SWITCH_SCREEN_DELAY);
        	}
    	}
    }

    @Test
    public void test_06() {//_scrollupscreen
    	for(int i = 0; i < 10 ; ++ i){
        	Dimension size = this.driver().manage().window().getSize();
        	int startX = size.width/2;
        	int startY = (int) (size.height *0.80);
        	int endY = (int) (size.height *0.20); 
        	
        	this.driver().swipe(startX,startY,startX,endY,2000);
        	
        	waitfor(NEEDS_SWITCH_SCREEN_DELAY);
    	}
    }
    
    @Test
    public void test_07() {//_scrolldownscreen
    	for(int i = 0; i < 10 ; ++ i){
    		Dimension size = this.driver().manage().window().getSize();
        	int startX = size.width/2;
        	int startY = (int) (size.height *0.25);
        	int endY = (int) (size.height *0.90);
        	this.driver().swipe(startX,startY,startX,endY,1000);
        	waitfor(NEEDS_SWITCH_SCREEN_DELAY);
    	}
    }
    
    public void waitfor(long time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
}
