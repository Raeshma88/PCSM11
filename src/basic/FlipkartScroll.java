package basic;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartScroll {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(8000);
		WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		/*js.executeScript("window.scrollBy(200,0)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(-200,0)");
*/
		/*
		 * js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");
		*/
		
}
}
