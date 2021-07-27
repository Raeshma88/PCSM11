package basic;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import org.openqa.selenium.TakesScreenshot;

public class Scenario7 {
	public static void main(String [] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		Actions a=new Actions(driver);
		WebElement jwell=driver.findElement(By.xpath("//a[@title='Jewellery']"));
		a.moveToElement(jwell).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(.,'Kadas')]")).click();
		Thread.sleep(2000);
		WebElement fav=driver.findElement(By.xpath("//a[@id='pid_8994']/img[@class='hc img-responsive center-block']"));
		fav.click();
		Set<String>tabs=driver.getWindowHandles();
		for(String tab:tabs)
		{
			driver.switchTo().window(tab);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
		Thread.sleep(2000);
		WebElement errmsg=driver.findElement(By.xpath("//div[@class='formErrorContent']"));
		System.out.println(errmsg.getText());
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		File ssSave=new File("./ScreenShot/bluestoneError.png");
		Files.copy(ss, ssSave);
		Thread.sleep(2000);
		driver.close();
		
		Set<String>tabs1=driver.getWindowHandles();
		for(String tab1:tabs1)
		{
			driver.switchTo().window(tab1);
		}
		Thread.sleep(2000);
		driver.close();
	}
}
