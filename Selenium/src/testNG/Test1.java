package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
 WebDriver driver;

  @Test
  public void f() 
  {
	  System.setProperty("webdriver.gecko.driver","D:\\Abhijeet\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();//delete cookies
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https:\\www.amazon.in");
  }
}
