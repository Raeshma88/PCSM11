package basic;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rollsRoyce {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rolls-roycemotorcars.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().getCookies(); 
		//Thread.sleep(3000);
		//driver.manage().deleteAllCookies();
		//Thread.sleep(3000);
		WebElement menu=driver.findElement(By.xpath("//button[@class='global-menu-button js-global-menu-cta rrmc-primary-nav-cta--gradient-black']"));
		menu.click();
		Thread.sleep(2000);
		WebElement model=driver.findElement(By.xpath("//div[@class='rrmc-global-menu js-menu is-enabled']/descendant::button[@aria-label='Models']/span[contains(.,'Models')]"));
		Thread.sleep(4000);
		model.click();
		Actions a=new Actions(driver);
		List<WebElement> diffmodels=driver.findElements(By.xpath("//div[@class='rrmc-scroll-links']/descendant::span[@class='rrmc-menu-link-copy']"));
		for(WebElement md:diffmodels)
		{
			Thread.sleep(2000);
			a.moveToElement(md).build().perform();
			Thread.sleep(3000);
			md.click();
			Thread.sleep(2000);
			
			String name=md.getText();
			System.out.println(name);
			Thread.sleep(1000);

			DemoScreenShot.Screen(driver,name);
			Thread.sleep(3000);
			
			
		}
		
	}
}

