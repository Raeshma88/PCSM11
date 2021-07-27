
package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bluestone {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.bluestone.com/");
		//driver.manage().window().maximize();
		WebElement tenplus=driver.findElement(By.xpath("//a[contains(.,'10+1 Monthly Plan')]"));
		tenplus.click();
		//System.out.println(tenplus.getText());
		Thread.sleep(2000);
		WebElement textf=driver.findElement(By.xpath("//input[contains(@id,'amount')]"));
		textf.sendKeys("1000");
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//input[contains(@id,'Email')]"));
		email.sendKeys("abcd123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@onclick,'preventGMSFormMultiSubmission(this);')]")).click();
		//Thread.sleep(2000);
		
}
}