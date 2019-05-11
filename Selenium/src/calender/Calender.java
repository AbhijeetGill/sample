package calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public void invokebrowser() {
		
			//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java");
			//Actions action=new Actions(driver);
			//action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
			//WebElement list=driver.findElement(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
			//System.out.println(l);
			//String s="03-october-1990";
			//String s1[]=s.split("-");
			//String day=s1[0];
			//String month=s1[1];
			//String year=s1[2];
			//System.out.println(day);
			//Select S=new Select(  
			//driver.findElement(By.xpath("//div[@id='Div1']//button[@type='button']")).click();
			//driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).clear();
			
	}
	public static void setdate(WebDriver driver,WebElement element,String dateval) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script= "arguments[0].setAttribute('value','"+dateval+"');";
		js.executeScript(script,element);
		//js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);
	}
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.yatra.com");
		//driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		WebElement da_te=driver.findElement(By.id("BE_flight_origin_date"));
		String date="31-03-2019";
		
		setdate(driver,da_te,date);
	}

}
