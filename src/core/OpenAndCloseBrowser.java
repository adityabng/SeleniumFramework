package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class OpenAndCloseBrowser {
	
	protected static WebDriver driver;
	long longWait = 60;
	
	@Parameters({"browser"})
	@BeforeClass
	public void openBrowser(String browser){
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("ff")||browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else{
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(longWait, TimeUnit.SECONDS);
		
	}
	
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}

}
