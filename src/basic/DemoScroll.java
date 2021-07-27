package basic;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScroll {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");
		//
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
*/
		WebElement ele=driver.findElement(By.xpath("//span[text()='Balwant Darshan Colony, Chinchwad, Pimpri-Chinchwad, Maharashtra']"));
		js.executeScript("argument[0].scrollIntoView()",ele);
}
}