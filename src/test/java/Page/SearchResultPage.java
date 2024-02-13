package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {

	@FindBy(css="ul li.preview")
	WebElement itemIcon;
	
	@FindBy(css="//button[contains(text(),'`Add to cart')]")
	WebElement addToBtn;
	
	public SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void viewItemdetail() {
		itemIcon.click();	
	}
	public boolean isItemListed() {
		return itemIcon.isDisplayed();	
	}
	public void addToCart() {
		itemIcon.click();	
	}
}
