package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class yatra {
	WebDriver driver;
	JavascriptExecutor je;
	Screen s;
	@Test
  public void f1() {

		try {
			new Screen();
			System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();//delete cookies
			driver.manage().window().maximize();//maximize window
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//for each element
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.get("https:\\www.fedex.com");
			//driver.findElement(By.name("flight_origin_city")).sendKeys("chandigarh");
			//driver.findElement(By.name("flight_destination_city")).sendKeys("pune");
			je=(JavascriptExecutor)driver;
			je.executeScript("scroll(0,800)");
			driver.findElement(By.xpath("//a[@title='India']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='trackingnumber']")).sendKeys("785636903812");
			driver.findElement(By.xpath("//button[@type='submit' and @id='btnSingleTrack']")).submit();
			//Pattern p=new Pattern("D:\\Abhijeet\\track.png");
			//s.wait(p,5);
			//s.click(p);
			driver.findElement(By.xpath("//span[contains(@text,'SHIP')]")).click();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	  
	  
	  
  }

