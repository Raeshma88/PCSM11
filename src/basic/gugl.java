package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gugl {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@title='Search']"));
		System.out.println("Displayed: "+search.isDisplayed());
		System.out.println("Enabled: "+search.isEnabled());
		search.sendKeys("java");
		Thread.sleep(2000);
		search.clear();
		Thread.sleep(2000);
		List<WebElement> fetchit=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for(WebElement fetching:fetchit)
		{
			System.out.println(fetching.getText());
		}
		fetchit.get(2).click();
		
	}
}
