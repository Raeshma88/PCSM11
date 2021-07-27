package testPom;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Bluestone;

public class testBluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Bluestone bl=new Bluestone(driver);
		bl.sendText("rings");
		Thread.sleep(1000);
		bl.ringClick();
		Set<String> tabs=driver.getWindowHandles();
		for(String tab:tabs) {
			driver.switchTo().window(tab);
		}
		bl.buyNowClick();
		System.out.println(bl.getErrorMes());
		
	}
}
