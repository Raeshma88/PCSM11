package demoTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoParall1 {
	@Test
	public void tc1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com//login.do");
		Thread.sleep(1000);
		driver.close();
	}

}
