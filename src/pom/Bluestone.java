package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bluestone {
	@FindBy(name="search_query")
	private WebElement searchBox;
	@FindBy(xpath="//img[@alt='The Felicita Top Open Ring']")
	private WebElement firstRing;
	@FindBy(xpath="//input[@id='buy-now']")
	private WebElement buynow;
	@FindBy(xpath="//div[text()='* This field is required']")
	private WebElement error;
	
	public Bluestone(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendText(String text)
	{
		searchBox.sendKeys(text,Keys.ENTER);
	}
	public void ringClick()
	{
		firstRing.click();
	}
	public void buyNowClick()
	{
		buynow.click();
	}
	public String getErrorMes()
	{
		return error.getText();
	}
}
