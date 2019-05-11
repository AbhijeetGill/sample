package zoopla_objects;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zoopla_base_class.Base_zoopla;

public class Object_class extends Base_zoopla {

	public Object_class() throws IOException {
	
		PageFactory.initElements(driver, this);
		
	}
	
//@FindBy(xpath="//button[contains(text(),'Accept')]")
//WebElement e1;
@FindBy(id="search-input-location")
WebElement e2;
@FindBy(id="search-submit")
WebElement e3;
@FindBy(xpath="//h4[@class='ui-agent__name']")
WebElement e4;



public void enter_value(String value) {
	
	e2.sendKeys(value);
	
}

public void submit() {
	
	e3.click();
}
public void display_price_of_properties() {
	String var=p.getProperty("x_path");
	List<WebElement> listElement = driver.findElements(By.xpath(var));
	for(int i =0;i<listElement.size();i++) {
	 String elementText = listElement.get(i).getText(); 
	 System.out.println(elementText); 
	 
	}
}
public void fifth_property() throws InterruptedException{
	@SuppressWarnings("unchecked")
	List<WebElement> listElement1 = driver.findElements(By.xpath(p.getProperty("x_path")));
	List<WebElement> list=listElement1.subList(4,5);
	for(int i=0;i<list.size();i++)
		
	System.out.println(list.get(i).getText());	
		
	
		
}


}

	



