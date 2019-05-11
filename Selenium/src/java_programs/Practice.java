package java_programs;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Practice {

@Test
public void f() throws InterruptedException {

WebDriver driver;
System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
driver.get("https://www.zoopla.co.uk");
driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
driver.findElement(By.xpath("//input[@id='search-input-location']")).sendKeys("london");
driver.findElement(By.id("search-submit")).click();
List<WebElement> listElement = driver.findElements(By.xpath("//a[@class='listing-results-price text-price']"));
for(int i=0;i<listElement.size();i++) {
 String elementText = listElement.get(i).getText(); 
 System.out.println(elementText);
 
}

listElement.get(5).click();

List<WebElement> listElement1 = driver.findElements(By.xpath("//h4[@class='ui-agent__name']"));
System.out.println(listElement1.get(0).getText());

listElement1.get(0).click();
String s=driver.getTitle();

}

}








