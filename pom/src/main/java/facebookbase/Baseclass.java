package facebookbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Baseclass {
WebDriver driver;
@FindBy(id="email")
WebElement email;
@FindBy(id="pass")
WebElement pwd;
@FindBy(id="u_0_2")
WebElement login;
	public Baseclass(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	
	public void login(String user,String pass,String url) {
		
		driver.get(url);
		email.sendKeys(user);
		pwd.sendKeys(pass);
		login.click();
	}
	
	
}
