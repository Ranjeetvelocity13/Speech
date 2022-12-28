package AlertPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup4 {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(); 
		  
		  driver.manage().window().maximize();
		  
		  //https ://username:password@
		  
		  driver.get("https://the-internet.herokuapp.com/upload");
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("C:\\Users\\RKENDRE\\Desktop\\Core Java\\Book1.xlsx");
		  
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();

	}

}
