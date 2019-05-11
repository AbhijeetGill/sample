package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Appiumtest {
	AppiumDriver<MobileElement> driver;

	@Test
	public void f() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","moto x4");
		dc.setCapability("udid","ZY224P68HM");
		dc.setCapability("platformName","Android");
		dc.setCapability("version","8.1.1");
		dc.setCapability("appPackage","in.org.npci.upiapp");
		dc.setCapability("appActivity",".HomeActivity");
		
		driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		
	}
	
	
	
	
}
