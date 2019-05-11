package googlesearch;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	WebDriver driver;
	JavascriptExecutor js;
	public void invokebrowser() {
		try {
			System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.get("https://www.google.com");
			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java");
			//Actions action=new Actions(driver);
			//action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
			WebElement list=driver.findElement(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
			//System.out.println(l);
			for(int i=0;i<8;i++) {
				System.out.println(list.size());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Google ob=new Google();
		ob.invokebrowser();

	}

}
