package BasePage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	private static Base testbase;
	private static WebDriver driver;
	//public static properties prop;
	private Base() {
		String browser="chrome";
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		//code to be added
	}
	
	public static void initDriver() {
		if(testbase==null)
		{
			testbase=new Base();
		}
	}
	public static WebDriver getDriver() {
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * public void startDriver() { WebDriver driver = new ChromeDriver(); } public
	 * void navigate() { driver.get("https://danube-webshop.herokuapp.com/");
	 * driver.manage().window().maximize(); } public void search() {
	 * 
	 * WebElement ele =
	 * driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/input"));
	 * ele.sendKeys("Parry Hotter");
	 * driver.findElement(By.xpath("//*[@id=\"button-search\"]")).click();
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"app-content\"]/div/div[1]/div[2]/ul/li")).click(); String val=
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"app-content\"]/div/div[1]/div/div/div[1]/h2")).getText(); String
	 * exp="parry hotter"; if(exp.equalsIgnoreCase(val)) {
	 * System.out.println("added right product"); } else {
	 * System.out.println("added wrong product"); } //add to cart
	 * driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[1]/div/button")
	 * ).click();
	 * 
	 * //checkout from cart
	 * driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div/button[1]")).
	 * click();
	 * 
	 * //check the checkout is proper String val1=
	 * driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div/button[1]")).
	 * getText(); String exp1="Checkout"; if(exp1.equalsIgnoreCase(val1)) {
	 * System.out.println("in checkout page"); } else {
	 * System.out.println("in checkout page"); }
	 * 
	 * 
	 * }
	 * 
	 * 
	 * JavascriptExecutor js=(JavascriptExecutor)driver;
	 * js.executeScript("Window.scrollBy(0,250)");
	 * 
	 * 
	 */

}
