
package basic;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario6{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		//driver.manage().window().maximize();
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		WebElement ring=driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
		a.moveToElement(ring).build().perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//ul[@class='two-col']/descendant::a[@title='Diamond Rings']")).click();
		Thread.sleep(2000);
		WebElement Defaultprice=driver.findElement(By.xpath("//span/span[contains(.,'Price')]"));
		a.moveToElement(Defaultprice).build().perform();
		List<WebElement> dfprice=driver.findElements(By.xpath("//form[@id='price']/descendant::span[@data-tagcategory='Price']"));
		for (WebElement prices : dfprice)
		{
			System.out.println(prices.getText());
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='content']/div/div[contains(.,'Sort by')]"));
		WebElement popular=driver.findElement(By.xpath("//span/span[contains(.,' Popular ')]"));
		a.moveToElement(popular).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(.,'Price Low to High')]")).click();
		Thread.sleep(2000);
		//Thread.sleep(2000);
		WebElement ltohtprice=driver.findElement(By.xpath("//span[@class='title style-fill i-right']/span[contains(.,'Price')]"));
		a.moveToElement(ltohtprice).build().perform();
		Thread.sleep(1000);
		List<WebElement> lhprice=driver.findElements(By.xpath("//form[@id='price']/descendant::span[@class='prcs-dlh']"));
		for (WebElement lhprices : lhprice)
		{
			System.err.println(lhprices.getText());
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		//Do.....Compare by default price and sorted price;verify sorted price should in ascending order;close browser
		
}
}
