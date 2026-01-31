package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr ;
	public static FileReader fr1 ;
	
    @BeforeMethod
    public void setup() throws IOException {
    	if(driver==null) {
    	FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFile\\config");
    	FileReader fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFile\\locaters");
		prop.load(fr);
		loc.load(fr1);
    	}

        if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
        	WebDriverManager.chromedriver().setup();   
        	driver = new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get(prop.getProperty("testurl"));
        	
    }else if  (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
    	WebDriverManager.chromedriver().setup();   
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get(prop.getProperty("testurl"));
    }
    }

    @AfterMethod
    public void tearDown() {
    	driver.close();
    	System.out.println("Teardown successful");
        
    }
		
		
    }


