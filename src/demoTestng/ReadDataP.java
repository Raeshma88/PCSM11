package demoTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataP {
	@Test(dataProviderClass=demoTestng.ReadDataDemo.class, dataProvider="read")
			public void tc(String user, String pass) throws InterruptedException
			{
		System.out.println(user+" "+pass);
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com//login.do");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(user);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pass,Keys.ENTER);
			}
			

}
