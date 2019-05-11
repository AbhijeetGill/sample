package Gmail;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Ecommerce {
@Test
public void ecommercewebsite() throws InterruptedException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
	JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,500)");
    WebElement element=driver.findElement(By.xpath("//div[@class='input-group date']//input[@type='text']"));
    WebElement e1=driver.findElement(By.xpath("//div[@class='panel-body']//input[@id='from']"));
	String dateval="13/01/1960";
    date(driver,element,dateval);
    
    date1(driver,e1,dateval);
}
	
	public static void date(WebDriver driver,WebElement element,String dateval) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);

	}
	public static void date1(WebDriver driver,WebElement element,String dateval) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);

		}
		
	


}

	
	



	
	
	
	
	

	
	
	

