package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {
@Test
public void f() {
	System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
	WebDriver driver;
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();//delete cookies
	driver.manage().window().maximize();//maximize window
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//for each element
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.get("https:\\www.zoopla.co.uk");
	
	
}
	
}
