package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageOM {
WebDriver driver;

By sear=By.xpath("//input[@title='Search']");


public PageOM(WebDriver driver1) {
	this.driver=driver1;
	
	
}
public void search(String search) {
	
	driver.findElement(sear).sendKeys(search);
	
}






}
