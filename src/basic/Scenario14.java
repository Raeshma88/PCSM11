package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario14 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		WebElement coin=driver.findElement(By.xpath("//a[text()='Coins ']"));
		a.moveToElement(coin).build().perform();
		Thread.sleep(2000);
		WebElement onegrm=driver.findElement(By.xpath("//span[text()='1 gram' and @data-p='gold-coins-weight-1gms,m']"));
		onegrm.click();
		Thread.sleep(2000);
		WebElement disp=driver.findElement(By.xpath("//h1[text()='1 gram 24 KT Gold Coin']"));
		//if(disp.getText())
		System.out.println(disp.getText());
		driver.close();
	}
}
//verify