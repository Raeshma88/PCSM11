
package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99_1 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//span[contains(.,'right click me')]"));
		Actions a=new Actions(driver);
		a.contextClick(ele).build().perform();
		//WebElement dele=driver.findElement(By.xpath("//button[contains(.,'Double-Click Me To See Alert')]"));
		//a.doubleClick(dele).build().perform();
}
}