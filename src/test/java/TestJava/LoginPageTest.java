package TestJava;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import QApage.LoginPage;

public class LoginPageTest extends QABase.TestBase{
	LoginPage loginpage;

	
	public LoginPageTest() {
		super();  //how call super class const - using super keyword
	}
	@BeforeMethod
	public void setup() {
		
		initialization();
		loginpage =new LoginPage();
		
	}
		 @Test(priority=1)
		 public void HomePageTitleTest() throws InterruptedException {
				String Title = loginpage.ValidateLoginPageTitle(props.getProperty("Username"), props.getProperty("Password"), props.getProperty("PIN"));
				 Assert.assertEquals(Title, "kite - Zerodha's fast and elegant flagship trading platform");
			}
		 
		 @Test(priority=2)
		 public void KiteUserID() throws InterruptedException {
			boolean UserID= loginpage.validateKiteloginUserID(props.getProperty("Username"), props.getProperty("Password"), props.getProperty("PIN"));
			Assert.assertTrue(true);
			
         }
	
	 @AfterMethod
	 public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
		
}
