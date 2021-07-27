package demoTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ggl2brwsr {

	@Test
	@Parameters("browser")
	public void tc(String  browser) throws InterruptedException
	{
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else 
		{
			driver=null;
	    }
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	
	/*
	public void tc() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}
	*/
}
}
