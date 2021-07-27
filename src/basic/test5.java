package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("username");
		WebElement password=driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		WebElement login=driver.findElement(By.id("loginButton"));
		login.click();
		//driver.close();

	}

}
