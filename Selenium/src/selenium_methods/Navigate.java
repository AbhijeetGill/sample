package selenium_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	WebDriver driver;
	JavascriptExecutor js;

	public void invokebrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();//delete cookies
			driver.manage().window().maximize();//maximize window
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//for each element
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			navi_gate();
} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void navi_gate() throws InterruptedException {
		//driver.navigate().to("https:\\www.flipkart.com");
		//driver.findElement(By.xpath("//span[contains(text(),'Washing Machine')]")).click();
		//driver.findElement(By.linkText("Contact Us")).click();
		//Thread.sleep(3000);
		//driver.navigate().back();
		//Thread.sleep(3000);
		//driver.navigate().forward();
		js=(JavascriptExecutor)driver;
		driver.get("https:\\www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("navi4328@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("gvx3210rdz&");
		driver.findElement(By.id("loginbutton")).click();
		driver.get("https:\\www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("flashlight");
		driver.findElement(By.xpath("//input[@class='nav-input']")).click();
		
		//driver.findElement(By.name("firstname")).sendKeys("Abhijeet");
		//driver.findElement(By.name("lastname")).sendKeys("Gill");
		//driver.findElement(By.name("reg_email__")).sendKeys("abhijeet.gill@gmail.com");
		//driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abhijeet.gill@gmail.com");
		//driver.findElement(By.name("reg_passwd__")).sendKeys("p012bk1");
		//driver.findElement(By.xpath("//select[@id='day']/option[@value='13']")).click();
		//driver.findElement(By.xpath("//select[@id='month']/option[@value='1']")).click();
		//driver.findElement(By.xpath("//select[@id='year']/option[@value='1960']")).click();

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Navigate n=new Navigate();
		n.invokebrowser();
			
	}

}
