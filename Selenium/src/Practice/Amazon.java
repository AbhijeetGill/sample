package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon {

@Test
public void ama_zon() throws FileNotFoundException {
	
Properties prop=new Properties();
FileInputStream fin=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium\\src\\Practice\\amazon.properties");
try {
	prop.load(fin);
	String URL=prop.getProperty("url");
	String sign_in=prop.getProperty("signin");
	String email=prop.getProperty("email");
	String continuebutton =prop.getProperty("continue");
	String password=prop.getProperty("password");
	String login=prop.getProperty("login");

	System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
	WebDriver driver;
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();//delete cookies
	driver.manage().window().maximize();//maximize window
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//for each element
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	Actions ob=new Actions(driver);
	ob.moveToElement(driver.findElement(By.xpath(sign_in))).build().perform();
	//driver.findElement(By.xpath(sign_in)).click();
	

	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

private WebElement findElement(By xpath) {
	// TODO Auto-generated method stub
	return null;
}
	
	
	
	
	
}
