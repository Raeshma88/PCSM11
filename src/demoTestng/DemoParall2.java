package demoTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoParall2 {
	@Test
	public void tc2() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.close();
}
}
