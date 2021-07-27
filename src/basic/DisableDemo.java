package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisableDemo {
public static void main(String [] args)
{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/Desktop/DisabledText.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebDriverWait ww=new WebDriverWait(driver,10);
	ww.until(new ExpectedCondition<Boolean>() {

		@Override
		public Boolean apply(WebDriver driver) {
			return driver.findElement(By.id("pqr")).isEnabled();
		}
		
	});
	//driver.findElement(By.id("pqr")).sendKeys("Ankur");
	WebElement me= driver.findElement(By.id("pqr"));
	me.sendKeys("Ankur");
	me.getText();
}
}
