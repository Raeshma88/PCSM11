package demoTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoMP {
	@Test
	public void tc1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
	}
	
	@Test
	public void tc2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	}
}
