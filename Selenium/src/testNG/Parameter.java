package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.excel.utility.Excel_util;

public class Parameter {
  @Test
  @Parameters("browser")
  public void f(String browser) {
	  WebDriver driver;
	  System.out.println("browser");
		//Excel_util reader=new Excel_util("D:\\Abhijeet\\testdata.xlsx");
		
        //System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
		//driver=new ChromeDriver();
		//driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		//driver.get("https:\\www.ebay.com");
		//driver.findElement(By.linkText("Sign in")).click();
	  System.out.println("browser");
  }
}
