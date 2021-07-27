package basic;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Scenario8 {
	public static void main(String [] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		Actions a=new Actions(driver);
		WebElement jwell=driver.findElement(By.xpath("//a[@title='Jewellery']"));
		a.moveToElement(jwell).build().perform();
		Thread.sleep(4000);
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
		driver.findElement(By.xpath("//span[@class='size-box-overlay']")).click();
		Thread.sleep(2000);
		WebElement sz=driver.findElement(By.xpath("//span[text()='2-4(2 4/16\")']"));
		sz.click();
		String a1=sz.getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
		Thread.sleep(4000);
		WebElement siz=driver.findElement(By.xpath("//span[text()='2-4(2 4/16\")']"));
		String a2=siz.getText();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		File ssSave=new File("./ScreenShot/bluestoneError.png");
		Files.copy(ss, ssSave);
		Thread.sleep(2000);
		if(a1.equals(a2))
		{
			System.out.println("same");
		}
		else
			System.out.println("NOt same");//got not same as answer instead same...check later
		Thread.sleep(20000);
		driver.close();
		Set<String>tab1=driver.getWindowHandles();
		for(String tab:tab1)
		{
			driver.switchTo().window(tab);
		}
		driver.close();
		
	}
}
