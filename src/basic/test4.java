package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("rae5hkv@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("123456");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		//driver.close();

	}

}
