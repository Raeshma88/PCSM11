package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime2 {
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com//login.do");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Keep me")).click();
		
	}

}
