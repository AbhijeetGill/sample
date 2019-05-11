package testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Amazon {
  WebDriver driver;
  WebElement e;
  Screen s;
  @Test
  public void f() {
	  try {
		  	s=new Screen();
			System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();//delete cookies
			driver.manage().window().maximize();//maximize window
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//for each element
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.get("https://www.amazon.in");
			//driver.findElement(By.xpath("//span[@class='nav-line-2' and contains(text(),'Your Orders')]")).click();
			//Select select=new Select(Select select=new Select(driver.findElement(By.xpath("//span[contains(text(),'Category')]"))););
			//select.selectByVisibleText("Mobiles and Computers");
			//WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Category')]"));
			//Actions action=new Actions(driver);
			//action.click(element).build().perform();
			List<WebElement> list=driver.findElements(By.tagName("a"));
			System.out.println(list.size());
			for(int i=0;i<=list.size();i++) {
				System.out.println(list.get(i).getText());
				
			}
	  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
  }
  }
}

