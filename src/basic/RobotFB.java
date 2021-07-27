package basic;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RobotFB {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement eng=driver.findElement(By.xpath("//div[@id='pageFooter']/descendant::a[contains(.,'English (UK)')]"));
		eng.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(4000);
		
		/*WebElement dob=driver.findElement(By.xpath("//font/font[contains(.,'Date of birth')]"));
		Actions a=new Actions(driver);
		Robot r=new Robot();
		a.moveToElement(dob).build().perform();
		dob.click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_9);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_9);*/
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		s.selectByVisibleText("9");
		Thread.sleep(2000);
		WebElement months=driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(months);
		s1.selectByValue("10");
		Thread.sleep(2000);
		List<WebElement> month=s1.getOptions();
		for(WebElement mon:month)
		{
			System.out.println(mon.getText());
		}
		Thread.sleep(2000);
		WebElement male=driver.findElement(By.xpath("//input[@value='2']"));
		male.click();
		Thread.sleep(2000);
		System.out.println("Gender clicked: "+male.isSelected());
		System.out.println(male.getTagName());
		Point loc=male.getLocation();
		System.out.println(loc);
		System.out.println(loc.getX()+" "+loc.getY());
		
		
		
	}
	

}
