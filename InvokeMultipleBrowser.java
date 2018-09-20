package MultipleBrowser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeMultipleBrowser 
{
	static WebDriver driver;
	static Properties pro;
	
	public static void browsercall() throws IOException 
	{
		File src=new File("P:\\Users\\vkamale\\Desktop\\Vivek 155373\\Eclipse_Workplace\\opencartAutomation\\src\\MultipleBrowser\\BrowserChoice.properties");
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
		
		
		String chromePath=pro.getProperty("chromeD");
		String IEPath=pro.getProperty("IE");
		String geckoPath=pro.getProperty("gecko");

				switch( pro.getProperty("BrowserChoice") )
				{
				case "chromeD" : System.setProperty("webdriver.chrome.driver",chromePath);
								driver=new ChromeDriver();
								System.out.println("Chrome opened using MultipleBrowser option!!");
								break;
								
			    case "IE"       :System.setProperty("webdriver.ie.driver",IEPath);
								driver=new InternetExplorerDriver();
								break;	
								
				case "gecko"   : File path=new File("geckoPath");
								  FirefoxBinary ffBinary=new FirefoxBinary();
								  FirefoxProfile ffProfile=new FirefoxProfile();
								  driver=new FirefoxDriver(ffBinary,ffProfile);
								  break;	
								
				case "htmlUnit": driver=new HtmlUnitDriver();
								 break;	
								
				case "IEedge":   System.setProperty("webdriver.edge.driver", "C:\\Users\\athomson\\MicrosoftWebDriver.exe");
								 WebDriver driver= new EdgeDriver();
					
				}
		

		driver.get(pro.getProperty("demourl"));
		driver.manage().window().maximize();
	
	}
	
	
}
