package facebookchild;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import facebookbase.Baseclass;

public class Child{


	@Test
	public void f() throws IOException {
		WebDriver driver;
		Properties p=new Properties();
		FileInputStream fin=new FileInputStream("\\Users\\HP\\eclipse-workspace\\pom\\pom.properties");
		p.load(fin);
		System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		Baseclass b=new Baseclass(driver);
		String url=p.getProperty("url");
		String name=p.getProperty("email");
		String pass=p.getProperty("password");
		b.login(name,pass,url);
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
