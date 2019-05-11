package zoopla_testng_class;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import zoopla_base_class.Base_zoopla;
import zoopla_objects.Object_class;

public class Testng_class extends Base_zoopla {

	Object_class ob;
	public Testng_class() throws IOException {
		
		super();
		
	}
	
	@BeforeMethod
	public void launch_browser() {
		initialization();
	}
		@Test
		public void submit() throws IOException, InterruptedException {
			ob=new Object_class();
			String city=p.getProperty("cityname");
			ob.enter_value(city);
			ob.submit();
			ob.display_price_of_properties();
			ob.fifth_property();
;	
		
		}
		
		
	
			
		}
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	

