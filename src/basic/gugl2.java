package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class gugl2 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		WebElement jv=driver.findElement(By.xpath("//h2/span[contains(.,'Java')]"));
		Thread.sleep(2000);
		a.doubleClick(jv).build().perform();
		
	}
}