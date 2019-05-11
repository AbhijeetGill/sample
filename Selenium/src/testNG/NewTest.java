package testNG;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver; 
	Screen screen;
	JavascriptExecutor je;
  @Test(priority=1,groups="A")
  public void invokebrowser() {
	  
			try {
				
				Pattern p1=new Pattern("D:\\Abhijeet\\signin.png");
				screen.wait(p1,3);
				screen.click(p1);
				System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().deleteAllCookies();//delete cookies
				driver.manage().window().maximize();//maximize window
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
				driver.get("https:\\www.amazon.in");
				screen=new Screen();
				
	} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
  
  
  @Test(priority=2,dependsOnGroups="A",groups="B")
  public void f2() {
		  driver.findElement(By.id("ap_email")).sendKeys("abhijeet.gill@gmail.com");
		  driver.findElement(By.id("continue")).submit();
		  driver.findElement(By.id("ap_password")).sendKeys("gvx3210rdz");
		  driver.findElement(By.id("signInSubmit")).submit();
		  Pattern p2=new Pattern("D:\\Abhijeet\\helloAbhijeet.png");
		  try {
			screen.wait(p2,2);
			screen.click(p2);
			  Pattern p3=new Pattern("D:\\Abhijeet\\yourorders.png");
			  screen.click(p3);

		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  



  }
  @Test(dependsOnGroups="B",priority=3)
  public void beforeTest() {
	  je=(JavascriptExecutor)driver;
	  je.executeScript("scroll(0,1500)");
	  Pattern p4=new Pattern("D:\\Abhijeet\\trackpackage.png");
	  try {
		screen.click(p4);
	} catch (FindFailed e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  je.executeScript("scroll(0,500)");

	  Pattern p5=new Pattern("D:\\Abhijeet\\id.png");
	  try {
		screen.click(p5);
		  driver.get("https:\\www.fedex.com");

		
		
	} catch (FindFailed e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  //Pattern p6=new Pattern("D:\\Abhijeet\\x.png");
	//  try {
		//screen.click(p6);
	//} catch (FindFailed e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
	  


	  
  

  @Test(priority=4)
  public void afterTest() {

  }
  @Test
  public void beforemethod() {
	  System.out.println("before any method");
  }
  @AfterMethod
  public void aftermethod() {
	  System.out.println("after any method");
  }
	  
  

}
