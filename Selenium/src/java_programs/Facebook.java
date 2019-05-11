package java_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Facebook {

@Test
public void f() {
	try {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();//delete cookies
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//for each element
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https:\\www.facebook.com");
		//driver.findElement(By.xpath("//span[@class='nav-line-2' and contains(text(),'Your Orders')]")).click();
		//Select select=new Select(Select select=new Select(driver.findElement(By.xpath("//span[contains(text(),'Category')]"))););
		//select.selectByVisibleText("Mobiles and Computers");
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		Select s=new Select(day);
		s.selectByIndex(03);
		Select s1=new Select(month);
		s1.selectByVisibleText("Oct");
		Select s2=new Select(year);
		s2.selectByValue("1990");
		//month.sendKeys("10");
		//year.sendKeys("1990");
		//List<WebElement> list=select.getOptions();
		//System.out.println(list.size());
		
  } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
}
}
}

