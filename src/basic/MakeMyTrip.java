package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='active makeFlex hrtlCenter column']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='fromCity']/p[@title='BOM, Chhatrapati Shivaji International Airport India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).click();
		//driver.findElement(By.xpath(""));
	}
}
