package Com.Kite.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Kite.qa.base.TestBase;

public class HomePage extends TestBase {

	  
	 @FindBy(xpath="//span[@class=\"user-id\"]")
	 WebElement UserID;
	 
	 @FindBy(xpath = "//a[contains(text(),' Coin')]")
	 WebElement ClickedUserID;
	 
	 @FindBy(xpath = "//span[contains(text(),'Positions')]")
	 WebElement Position;
	 
	 @FindBy(xpath ="//span[@class=\"nickname\"]")
	 WebElement Nickname;
	 
	 public  HomePage() {
		 PageFactory.initElements(driver, this);
	 }
     public boolean validateKiteloginUserID() {   	  	  
   	  return UserID.isDisplayed();
   	  
     }
     
     
     
}
