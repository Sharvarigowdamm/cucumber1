package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MacBookBase {
	private static MacBookBase mac;
	private static WebDriver driver;
	//public static properties prop;
	private MacBookBase() {
		{
			String browser= "chrome";
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.out.println("in chrome");
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("edge"))
			{
				driver=new EdgeDriver();
			}
			driver.manage().window().maximize();
			//code to be added
		}
	}
	public static void initDriver() {
		if(mac==null)
		{
			mac= new MacBookBase();
		}
	}
	public static WebDriver getDriver() {
		System.out.println(driver);
		return driver;
	}
	public static void  openUrl(String url) {
		driver.get(url);
	}
	public static void tearDown() {
		
		if(driver!=null)
		{
			driver.close();
			driver.quit();
		}
	}

}
