package testdata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Excel_util;

public class Excel_Test {
WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		Excel_util reader=new Excel_util("D:\\Abhijeet\\testdata.xlsx");
		
        System.setProperty("webdriver.chrome.driver","D:\\Abhijeet\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https:\\www.ebay.com");
		driver.findElement(By.linkText("Sign in")).click();
		
        int row=reader.getRowCount("Sheet1");
        System.out.println(row);
        reader.addColumn("Sheet1","result");
        for(int rownum=2;rownum<=row;rownum++)
        {
        	String name=reader.getCellData("Sheet1","username",rownum);
    		String pwd=reader.getCellData("Sheet1","password",rownum);
    		driver.findElement(By.xpath("//input[@id='userid']")).clear();
    		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(name);
    		driver.findElement(By.xpath("//input[@id='pass']")).clear();
    		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
    		reader.setCellData("Sheet1","result",rownum,"pass");
    		
        }
		
		
		
		


}
}