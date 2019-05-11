package zoopla_base_class;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_zoopla {


		public static WebDriver driver;
		public static Properties p;
		  
		public Base_zoopla() throws IOException{
			p=new Properties();
			FileInputStream fin=new FileInputStream("\\Users\\HP\\eclipse-workspace\\maven_demo_test\\test_config");
			p.load(fin);
			


		}
		  public static void initialization() {
			System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");

			  String drivername=p.getProperty("browser");
				if(drivername.equals("chrome")) {
					driver=new ChromeDriver();
					
				}
				else
				{
					driver=new FirefoxDriver();
				}

				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
				driver.get(p.getProperty("url"));
		  }
		  
		
		
		
		
		
	}
	
