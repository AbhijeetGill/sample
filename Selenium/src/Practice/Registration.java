package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Registration {
@Test
public void register() throws IOException {
	
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().fullscreen();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.crmpro.com/register/");
	Properties p=new Properties();
	try {
		FileInputStream fin=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium\\src\\Practice\\register.properties");
		p.load(fin);
	
	
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Select ob=new Select(driver.findElement(By.name("payment_plan_id")));
	ob.selectByVisibleText("Free Edition");
	driver.findElement(By.name("first_name")).sendKeys(p.getProperty("name"));
	driver.findElement(By.name("surname")).sendKeys(p.getProperty("lastname"));
	driver.findElement(By.name("email")).sendKeys(p.getProperty("email"));
	driver.findElement(By.name("email_confirm")).sendKeys(p.getProperty("email"));
	driver.findElement(By.name("username")).sendKeys(p.getProperty("username"));
	driver.findElement(By.name("password")).sendKeys(p.getProperty("password"));
	driver.findElement(By.name("passwordconfirm")).sendKeys(p.getProperty("password"));
	driver.findElement(By.name("agreeTerms")).click();






	
}
	
	
	
	
	
	
}
