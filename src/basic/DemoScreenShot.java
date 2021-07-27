package basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DemoScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String Title=driver.getTitle();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		DemoScreenShot.Screen(driver,Title);
	/*	TakesScreenshot ts=(TakesScreenshot) driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		File ssSave=new File("./ScreenShot/facebook.png");
		Files.copy(ss, ssSave);	
		*/	
	}
	
	public static void Screen(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		File ssSave=new File("./ScreenShot/"+name+".png");
		Files.copy(ss, ssSave);	
	}
}
