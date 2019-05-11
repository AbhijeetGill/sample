import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readpropertyfile {

	public static void main(String[] args) throws IOException {

		Properties p=new Properties();
		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium\\src\\config.properties");
			p.load(fin);
			System.out.println(p.getProperty("name"));
			System.out.println(p.getProperty("age"));
			System.out.println(p.getProperty("URL"));
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
