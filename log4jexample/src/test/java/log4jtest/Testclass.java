package log4jtest;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Testclass {
    static Logger logger = LogManager.getLogger(Testclass.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        System.out.println("hello");
				logger.debug("This is a debug message");
		        logger.info("This is an info message");
		        logger.warn("This is a warn message");
		        logger.error("This is an error message");
		        logger.fatal("This is a fatal message");
		    }
		

		
		
		
		
		
	}


