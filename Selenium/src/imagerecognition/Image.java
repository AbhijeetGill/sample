package imagerecognition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Image {
	WebDriver driver;
	Screen screen;
	private String flashlight;
	private String target;
	public void invokebrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();//delete cookies
			driver.manage().window().maximize();//maximize window
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.get("https:\\www.amazon.in");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void amazonpage() {
		try {
			screen=new Screen();

			Pattern p=new Pattern("D:\\Abhijeet\\signin.png");
			screen.wait(p,5);

		    screen.click(p);
			driver.findElement(By.id("ap_email")).sendKeys("abhijeet.gill@gmail.com");
			Pattern p2=new Pattern("D:\\Abhijeet\\continue.png");
			screen.click(p2);
			driver.findElement(By.id("ap_password")).sendKeys("gvx3210rdz");
			driver.findElement(By.id("signInSubmit")).submit();
			driver.navigate().back();


			//screen.type(p,"abhijeet.gill@gmail.com");
			//Pattern p1=new Pattern("D:\\Abhijeet\\pass.png");
			//screen.wait(p1,2);
			//screen.type(p1,"gvx3210rdz&");
			
			//Pattern p3=new Pattern("D:\\Abhijeet\\.png");
			//screen.wait(p3,10);
			//screen.click(p3);


			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Image ob=new Image();
			ob.invokebrowser();
			ob.amazonpage();
	}

}
