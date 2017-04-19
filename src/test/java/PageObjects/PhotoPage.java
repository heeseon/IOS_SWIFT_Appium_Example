package PageObjects;

import java.util.List;

import io.appium.java_client.MobileElement;

public interface PhotoPage {
	public MobileElement getCameraRoll();
	public List<MobileElement> getPhotos();
	public List getScreenElements();
	public MobileElement getAlertWindow();
}
