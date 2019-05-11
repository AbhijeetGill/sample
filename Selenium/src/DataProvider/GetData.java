package DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetData {
WebDriver driver;
@BeforeMethod
public void before() {
System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();//delete cookies
	driver.manage().window().maximize();//maximize window
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//for each element
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.get("https://www.ebay.com");
	driver.findElement(By.linkText("Sign in")).click();
}
@Test(dataProvider="get")
public void get(String username,String password) {
	
	driver.findElement(By.xpath("//input[@id='userid']")).clear();
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='pass']")).clear();
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
}

	@DataProvider
	public Iterator<Object[]> get(){
		ArrayList<Object[]> getobject=Fetch.data();
		return getobject.iterator();
	}
























}
