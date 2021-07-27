
package basic;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseurban  {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement close=driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		close.click();
		Actions a=new Actions(driver);
		List <WebElement> menues=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		for(WebElement menuName:menues)
		{
		System.out.println(menuName.getText());
		a.moveToElement(menuName).perform();
		Thread.sleep(2000);
	
		}
}}
