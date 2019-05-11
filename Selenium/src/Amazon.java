
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


	public class Amazon {
	WebDriver driver;
	JavascriptExecutor js;
	WebElement wait;
	public void invokebrowser() {
		try {
			System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.get("https://www.amazon.in");
			driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']//span[@class='nav-icon nav-arrow']")).click();
			driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")).click();
			driver.findElement(By.id("ap_email")).sendKeys("abhijeet.gill@gmail.com");
			WebElement e=driver.findElement(By.id("continue"));
			wait=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOf(e));
			e.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon ob=new Amazon();
		ob.invokebrowser();

	}

}
