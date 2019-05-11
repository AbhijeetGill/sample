package selenium_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	WebDriver driver;
	public void invokebrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();//delete cookies
			driver.manage().window().maximize();//maximize window
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			getmethods();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void getmethods() {
		
		try {
			driver.get("https://www.amazon.in");
			String Title=driver.getTitle();
			System.out.println(Title);
			driver.findElement(By.linkText("Today's Deals")).click();
			String currenturl=driver.getCurrentUrl();
			System.out.println(currenturl);
			System.out.println(driver.getPageSource());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods a=new Methods();
		a.invokebrowser();
		

	}

}
