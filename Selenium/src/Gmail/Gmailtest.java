package Gmail;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmailtest {
@Test
public void gmail() {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.get("https://www.gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys("abhijeet.gill@gmail.com");
	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gvx3210rdz!");
	driver.findElement(By.className("RveJvd snByac")).click();
	driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
	Set<String> window=driver.getWindowHandles();
	Iterator<String> it=window.iterator();	
	String parentWindow=it.next();
	it.next();
	System.out.println(driver.getTitle());
	
}
}
