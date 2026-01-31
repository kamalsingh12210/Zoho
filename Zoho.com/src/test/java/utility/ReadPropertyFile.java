package utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\Framework\\IRCTC\\src\\test\\resources\\configFile\\config");
		Properties prop = new Properties();
		prop.load(fr);
		
		// Print specific properties
        System.out.println("URL: " + prop.getProperty("browser"));
        System.out.println("URL: " + prop.getProperty("testurl"));
	}

}
