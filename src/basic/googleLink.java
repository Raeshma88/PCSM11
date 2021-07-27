package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleLink {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			System.out.println(link.getText());
		}
		Thread.sleep(2000);
		System.err.println(links.size());
		
}
}