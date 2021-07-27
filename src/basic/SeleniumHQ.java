package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHQ {
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement search= driver.findElement(By.xpath("//input[@name='search']"));
		Thread.sleep(1000);
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		search.sendKeys("testng",Keys.ENTER);
	}

}
