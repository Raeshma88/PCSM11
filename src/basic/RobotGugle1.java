package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotGugle1 {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		Robot r=new Robot();
		WebElement jv=driver.findElement(By.xpath("//h2/span[contains(.,'Java')]"));
		Thread.sleep(1000);
		a.doubleClick(jv).build().perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
	}
}
