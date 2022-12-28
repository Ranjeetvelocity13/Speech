package Com.Kite.qa.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import Com.Kite.qa.util.TestUtil;
import net.bytebuddy.utility.RandomString;


public class TestBase {
  public static WebDriver driver;
  public static Properties props;
   
public TestBase()  {

	  try {
		  props=new Properties();
		  FileInputStream ip=new FileInputStream("C:\\Users\\RKENDRE\\eclipse-workspace\\TesNgTutorial\\Test\\src\\main\\java\\Com\\Kite\\"
		  		+ "qa\\config\\config.properties");
		  
		  props.load(ip);

	  }catch(FileNotFoundException e) {
		  e.printStackTrace();
	  }catch(IOException e) {
		  e.printStackTrace();
	  }
	}

  public static void initialization() {
	  String browsername = props.getProperty("browser");
	  ChromeOptions option = new ChromeOptions();
		
		 option.addArguments("--disable-notifications");
	     System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
			  driver = new ChromeDriver(option); 		
		    
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	 
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	  
	  driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	  
	  driver.get(props.getProperty("url"));
	
     }


          
//      File Source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	  String random=RandomString.make();	  
//	  String  filename = "Kite";
//	  
//	  File Destination =new File(".\\Screenshot\\"+filename+""+random+".jpg");
//	  FileHandler.copy(Source, Destination);
//	  return filename;
	   public String getScreenShotPath(String testCaseName) throws IOException
	   {
		   
	   	TakesScreenshot ts=(TakesScreenshot) driver;
	   	File source =ts.getScreenshotAs(OutputType.FILE);
	   	String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	   	FileUtils.copyFile(source,new File(destinationFile));
	   	return destinationFile;

}
  
}