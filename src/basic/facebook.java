
package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='u_0_2_ID']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("raeshma");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("pande");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("1234567893");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("pandu123!");
		//Thread.sleep(2000);
		//driver.findElement(By.name("websubmit")).click();
		
		
}
}