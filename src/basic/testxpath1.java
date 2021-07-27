package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testxpath1 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.urbanladder.com/");
		//driver.manage().window().maximize();
		WebElement store=driver.findElement(By.xpath("//a[contains(.,'Stores')]"));
		store.click();
	//	WebElement first=driver.findElement(By.xpath("//a[contains(.,'Stores')]")).click();;
}
}