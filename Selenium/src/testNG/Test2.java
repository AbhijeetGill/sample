package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;
	@Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();//delete cookies
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https:\\www.facebook.com");
  }
}
