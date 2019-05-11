package java_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();//delete cookies
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//for each element
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		list.addAll(driver.findElements(By.tagName("img")));
		List<WebElement> activelinks=new ArrayList<WebElement>();
		System.out.println(list.size());
		for(int i=0;i<=list.size();i++) {
			//System.out.println(list.get(i).getAttribute("href"));

			{
				activelinks.add(list.get(i));
	}
		}
	System.out.println(activelinks.size());
	}
	

}
