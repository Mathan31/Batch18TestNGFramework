package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BrowserFactory {
	
	public static WebDriver driver;
	int iBrowser = 1;
	public String url = "https://credosystemz2-dev-ed.my.salesforce.com/";
	
	@BeforeClass
	public void launchBrowser() {
		switch (iBrowser) {
		case 1:
			System.out.println("User option is - "+iBrowser+" ,So invoking the Chrome browser!!");
			driver = new ChromeDriver();
			break;
			
		case 2:
			System.out.println("User option is - "+iBrowser+" ,So invoking the Firefox browser!!");
			driver = new FirefoxDriver();
			break;
			
		case 3:
			System.out.println("User option is - "+iBrowser+" ,So invoking the Edge browser!!");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("User option is  wrong - "+iBrowser+" ,So invoking the default chrome browser!!");
			driver = new ChromeDriver();
			break;
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
}
