package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDemoActiTimePoup {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']")).click();
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
}
}