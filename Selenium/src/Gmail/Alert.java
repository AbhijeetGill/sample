package Gmail;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
@Test
public void alert() throws InterruptedException {
	
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
	JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,500)");
	driver.findElement(By.linkText("Follow On Twitter")).click();
	String parent=driver.getWindowHandle();
	Set<String> handle=driver.getWindowHandles();
	Iterator<String> it=handle.iterator();
	it.next();
	String child=it.next();
	//System.out.println(child);
	System.out.println(child);
	Thread.sleep(3000);
	System.out.println(driver.switchTo().window(child).getTitle());
	driver.switchTo().window(child).close();
	driver.switchTo().window(parent);
	
    driver.findElement(By.xpath("//a[contains(text(),'Follow Twitter & Facebook')]")).click();
    Set<String> handles=driver.getWindowHandles();
    Iterator<String> iterator=handles.iterator();
    iterator.next();
    String child1=iterator.next();
    driver.switchTo().window(child1).close();		
    String child2=iterator.next();
    //driver.switchTo().window(child2).close();

}
}
