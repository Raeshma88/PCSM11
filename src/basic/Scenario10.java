package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario10 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);
		WebElement frame=driver.findElement(By.xpath("//iframe[@name='chat-widget']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//p[text()='Leave a message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='st5xy0kn4mc_146917605549304831']")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement chat=driver.findElement(By.xpath("//textarea[@aria-label='Write a message…']"));
		chat.sendKeys("HI",Keys.ENTER);
		Thread.sleep(4000);
		WebElement rep=driver.findElement(By.xpath("//span[@class='lc-1m0ne5q e1tnd1n32']"));
		System.out.println("reply: "+rep.getText());
		
	}
}
//getting StaleElementReference Exception try with pom...later