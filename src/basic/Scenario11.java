package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario11 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		WebElement offer=driver.findElement(By.xpath("//span[text()='Offers ']"));
		a.moveToElement(offer).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Upto 20% Making Charges Off on Plain Gold Jewellery']")).click();
		Thread.sleep(2000);
		List<WebElement> of=driver.findElements(By.xpath("//ul[@class='product-grid ']/descendant::span[@class='offers-wrapper']"));
		for (WebElement ofr:of)
		{
			System.out.println(ofr.getText());
			Thread.sleep(2000);
		}
		
	}

}
//verification