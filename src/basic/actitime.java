
package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime  {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		//driver.manage().window().maximize();
		WebElement user=driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		System.out.println(user.getText());
		WebElement username=driver.findElement(By.xpath("//input[contains(@name,'username')]"));
		username.sendKeys(user.getText());
		Thread.sleep(2000);
		
		WebElement pass=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		System.out.println(pass.getText());
		WebElement password=driver.findElement(By.name("pwd"));
		password.sendKeys(pass.getText());
		WebElement login=driver.findElement(By.id("loginButton"));
		System.out.println("is displd"+login.isDisplayed());
		System.out.println("is enabld"+login.isEnabled());
		login.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'logoutLink')]")).click();
		
}}