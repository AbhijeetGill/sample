package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pom{
WebDriver driver;
@FindBy(how=How.NAME,using="q") 
WebElement input;
	
public Pom(WebDriver driver2) {
	this.driver=driver2;
							  }
public void value(String inp) {
	
	input.sendKeys(inp);
	
}



 


 
 
}
