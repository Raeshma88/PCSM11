
package basic;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urbnladrfectch  {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement close=driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		close.click();
		List <WebElement> menues=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		for(WebElement menuName:menues)
		{
		System.out.println(menuName.getText());
	
		}
}}
