package utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Loc {
	public static void main(String[] args) throws IOException {
	FileReader fr1 = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\Framework\\IRCTC\\src\\test\\resources\\configFile\\locaters");
	Properties loc = new Properties();
	loc.load(fr1);
	System.out.println("URL: " + loc.getProperty("signin_link"));
	
	}
}


