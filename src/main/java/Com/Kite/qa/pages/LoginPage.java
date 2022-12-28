package Com.Kite.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Kite.qa.base.TestBase;


public class LoginPage extends TestBase {
	//PageFacory 
      @FindBy(id="userid")	
      WebElement Username;
      
      @FindBy(xpath="//input[@id=\"password\"]")
      WebElement Password;
      
      @FindBy(xpath="//button[@type=\"submit\"]") 
      WebElement LoginButton;
      
  	  @FindBy(id="pin")
  	  WebElement Pin;
  	
  	  @FindBy(xpath="//button[@type=\"submit\"]")
  	  WebElement Continue;
  	  
 	 @FindBy(xpath="//span[@class=\"user-id\"]")
  	 WebElement UserID2;
 	 
      //initializing the page object
      public LoginPage() {// Constructor
  		
  		//PageFactory.initElements(driver1, this);
  		PageFactory.initElements(driver, this);
  		
  	}     
      public String ValidateLoginPageTitle(String UN,String PWD, String PIN) throws InterruptedException {
    	
    	Thread.sleep(2000);
    	return driver.getTitle();
      }
      
      public boolean validateKiteloginUserID(String UN,String PWD, String PIN) throws InterruptedException {
    	  Username.sendKeys(UN);
    	  Thread.sleep(2000);
    	  Password.sendKeys(PWD);
    	  Thread.sleep(2000);
    	  LoginButton.click();
    	  Thread.sleep(2000);
    	  Pin.sendKeys(PIN);
    	  Thread.sleep(2000);
    	  Continue.click();
   	  
    	  return UserID2.isDisplayed();
      }     
      public HomePage login(String UN,String PWD, String PIN) throws InterruptedException {
    	  Username.sendKeys(UN);
    	  Thread.sleep(2000);
    	  Password.sendKeys(PWD);
    	  Thread.sleep(2000);
    	  LoginButton.click();
    	  Thread.sleep(2000);
    	  Pin.sendKeys(PIN);
    	  Thread.sleep(2000);
    	  Continue.click();  	  
    	  return new HomePage();
      }
     
}