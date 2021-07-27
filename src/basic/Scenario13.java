package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario13 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		WebElement offer=driver.findElement(By.xpath("//span[text()='Offers ']"));
		a.moveToElement(offer).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Additional 50% off on your 1st installment on GMS']")).click();
		Thread.sleep(2000);
		List<WebElement> of=driver.findElements(By.xpath("//div[@id='product-display']/descendant::span[@class='offer']"));
		for (WebElement ofr:of)
		{
			System.out.println(ofr.getText());
			Thread.sleep(2000);
		}
		driver.close();
	}
	//not done

}
