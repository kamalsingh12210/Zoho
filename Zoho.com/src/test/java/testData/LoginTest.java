package testData;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;


public class LoginTest extends Base{
	@Test(dataProvider = "testdata")
	public void LoginTest(String username, String password) throws InterruptedException {
   driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
   Thread.sleep(2000);
   driver.findElement(By.name(loc.getProperty("email_fields"))).sendKeys(username);
   Thread.sleep(1000);
   driver.findElement(By.id(loc.getProperty("next_button"))).click();
   Thread.sleep(1000);
   driver.findElement(By.name(loc.getProperty("pwd_field"))).sendKeys(password);
   driver.findElement(By.id(loc.getProperty("login_next_button"))).click();
   String Expected_URL = "https://accounts.zoho.in/signin?servicename=ZohoHome&signupurl=https://www.zoho.com/signup.html";
   String Actual_URl = driver.getCurrentUrl();
   Assert.assertEquals(Actual_URl, Expected_URL);
   
   
	}
	@DataProvider(name = "testdata")
	public Object[][] testData() {
		return new Object[][] {
            {"kamal.chipsoft@gmail.com", "Kamalsingh@123"}
	};
	}
}


