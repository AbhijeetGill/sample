package Gmail;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Alertpopup {

@Test
public void alert() throws InterruptedException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.get("https://www.peterengland.com");
	driver.findElement(By.xpath("//span[@class='tab-login']")).click();
	org.openqa.selenium.Alert alert=driver.switchTo().alert();
	alert.dismiss();
	
	//driver.findElement(By.xpath("//input[@id='top_search']")).sendKeys("abhijeet");
	
}
	
	
	
	
	
	
}
