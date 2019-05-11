package java_programs;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class DisableImages {
	
	public static void main(String args[]) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	disableimageinchrome(options);
	
	driver=new ChromeDriver(options);
	driver.manage().deleteAllCookies();//delete cookies
	driver.manage().window().maximize();//maximize window
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//for each element
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in");


	}
	
	public static void disableimageinchrome(ChromeOptions options) {
	HashMap<String,Object> image=new HashMap<String,Object>();
	image.put("images",2);
	HashMap<String,Object> prefs=new HashMap<String,Object>();
	prefs.put("profile.default_content_setting_values",image);
	options.setExperimentalOption("prefs",prefs);
	
	
	
	}

}
