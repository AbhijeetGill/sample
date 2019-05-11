package Gmail;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowhandle {
@Test
public void window() {
	
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.get("https://www.gmail.com");
	String handle=driver.getWindowHandle();
	Set<String> window=driver.getWindowHandles();
	Iterator<String> it=window.iterator();	
	String parentWindow=it.next();
	
}
}
