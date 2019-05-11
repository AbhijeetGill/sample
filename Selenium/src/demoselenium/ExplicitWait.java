package demoselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	WebDriver driver;
	JavascriptExecutor js;
	public void invokebrowser() {
		try {
			System.setProperty("webdriver.gecko.driver","D:\\Abhijeet\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	WebElement firstname=driver.findElement(By.name("firstname"));
	WebElement lastname=driver.findElement(By.name("lastname"));
    sendKeys(driver,firstname,10,"abhijeet");
    sendKeys(driver,lastname,20,"gill");
    WebElement clickon=driver.findElement(By.xpath("//input[@value='Log In']"));
    click(driver,clickon,10);
	}
	
	public void sendKeys(WebDriver driver1,WebElement element,int timeout,String value)
	{
		new WebDriverWait(driver1,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public void click(WebDriver driver1,WebElement element,int timeout)
	{
		new WebDriverWait(driver1,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExplicitWait ob=new ExplicitWait();
		ob.invokebrowser();
		

	}

}
