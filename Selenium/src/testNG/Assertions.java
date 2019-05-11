package testNG;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions {
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
			driver.get("https://www.gmail.com");
} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  @Test
  public void f() 
  {
	  invokebrowser();
	  //String title=driver.getTitle();
	  //Assert.assertEquals(title,"Gmail");
	  //System.out.println(title);
  }
  @Test
  public void afterTest() {
	  driver.quit();
	 
			try {
				System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().deleteAllCookies();//delete cookies
				driver.manage().window().maximize();//maximize window
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
				driver.get("https://www.facebook.com");
	} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  }

}
