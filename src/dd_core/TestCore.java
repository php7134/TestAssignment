package dd_core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCore
{
	public static Properties config = new Properties();
	public static Properties object = new Properties();
	//public static ExcelReader excel = null;
	public static WebDriver driver = null;
	public static FileInputStream fis;
	public static Logger app_logs = Logger.getLogger("devpinoyLogger");

	@BeforeSuite
	public static void init() throws IOException 
	{
		if (driver == null) 
		{
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\dd_properties\\config.properties");
			config.load(fis);
			app_logs.debug("Loading the config property file");

			fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\dd_properties\\object.properties");
			object.load(fis);
			app_logs.debug("Loading the object property file");

			app_logs.debug("Launching Browser.");
			
			if (config.getProperty("browser").equals("chrome")) 
			{
			//System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				System.out.println("****************Launching Browser******************");
				driver.manage().window().maximize();
				

			}
			else if (config.getProperty("browser").equals("firefox")) 
			{
				//System.setProperty("webdriver.geckodriver.driver","C:\\SeleniumDrivers\\geckodriver-v0.27.0-win64\\\\geckodriver.exe");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			} 
			else if (config.getProperty("browser").equals("ie")) 
			{
				//System.setProperty("webdriver.ie.driver","C:\\SeleniumDrivers\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();

			}
			else if (config.getProperty("browser").equals("edge"))
			{
				System.setProperty("webdriver.msedgedriver.driver",
						"C:\\SeleniumDrivers\\edgedriver_win64\\msedgedriver_win64.exe");
				WebDriverManager.edgedriver().setup();
				driver = new InternetExplorerDriver();

			}
			app_logs.debug("opening test site");
			driver.get(config.getProperty("testsite"));
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		}
	}

	@AfterSuite
	
	public void QuitDriver() throws InterruptedException
	{
		Thread.sleep(3000);
		if (driver != null)
		{
			System.out.println("****************Closing browser.******************");
			app_logs.debug("Closing browser.");
			driver.close();
		}

	}
}
