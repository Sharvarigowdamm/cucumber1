package MacBookScenario;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//mac
public class HomePage {
	WebDriver driver;
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	@FindBy(xpath="@FindBy(name=\"searchbar\")")
	WebElement searchbar;

	@FindBy(xpath="//*[@id=\"search\"]/span/button")
	WebElement searchBtn;

	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]")
	WebElement cartBtn;


	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		}

	public void navigateToCartPage()
	{
		cartBtn.click();
		}

	public void searchItem(String strItem)
	{
		searchbar.sendKeys(strItem);
		searchBtn.click();
		}
}
