package grid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestGrid {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nodeUrl;
		try {
			nodeUrl="http://192.168.1.5:4444/wd/hub";
			DesiredCapabilities dc=DesiredCapabilities.chrome();
			dc.setBrowserName("chrome");
			dc.setPlatform(Platform.WIN10);
			ChromeOptions options=new ChromeOptions();
			options.merge(dc);
			WebDriver driver=new RemoteWebDriver(newURL(nodeUrl),options);
			//driver.manage().deleteAllCookies();//delete cookies
			//driver.manage().window().maximize();//maximize window
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			//driver.get("https://www.amazon.in");
			System.out.println(driver.getTitle());
			
			
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				}
	private static CommandExecutor newURL(String nodeUrl2) {
		// TODO Auto-generated method stub
		return null;
	}

}
