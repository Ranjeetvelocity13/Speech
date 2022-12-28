package Com.Kite.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Com.Kite.qa.base.TestBase;

public class PinPage extends TestBase {

	@FindBy(id="pin")
	WebElement Pin;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement Continue;
	
	public void Pinpage() {
		Pin.sendKeys("449192");
	}
	public void Continuebutton() {
		Continue.click();
	}
}
