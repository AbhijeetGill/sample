package demoselenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo {
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
		driver.get("https://www.edureka.co");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void searchelement() {
	driver.findElement(By.id("search-inp")).sendKeys("java");
}

public void scroll(){
	try {
		js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,5000)");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		public static void main(String[] args) 
		{
		
		Demo a=new Demo();
		a.invokebrowser();
		a.searchelement();
		a.scroll();
	}

}
