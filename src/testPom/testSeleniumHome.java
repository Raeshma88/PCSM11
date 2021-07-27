package testPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.SeleniumHome;

public class testSeleniumHome {
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		SeleniumHome sh=new SeleniumHome(driver);
		sh.sendText("java");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		sh.sendText("testng");
	}

}
