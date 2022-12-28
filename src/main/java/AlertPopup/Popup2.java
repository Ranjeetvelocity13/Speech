package AlertPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2 {

	public static void main(String[] args) throws InterruptedException {
	

		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(); 
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		  
		  Thread.sleep(3000);
		  
		//  driver.switchTo().alert().accept();
		  driver.switchTo().alert().dismiss();
	}

}
