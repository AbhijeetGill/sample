package stepdefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_defination {
	WebDriver driver;

	@Given("^i am on login page$")
    public void facebookpage() {
	System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");

	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().fullscreen();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	
}
@When("^i enter username$")
public void enterusername(DataTable credentials) {
	List<List<String>> data=credentials.raw();
	
	driver.findElement(By.id("email")).sendKeys(data.get(0).get(0));
	
}
@And("^i enter \"(.*)\" and click login$")
	public void enterpassword(String password) {
	driver.findElement(By.id("pass")).sendKeys(password);
	
	
}
@Then("^i can enter user account$")
public void enteraccount() {
	driver.findElement(By.id("u_0_3")).submit();

	
}

}
