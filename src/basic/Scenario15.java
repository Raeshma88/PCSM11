package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario15 {
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
		WebElement twogrm=driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-2gms,m' and text()='2 gram']"));
		twogrm.click();
		Thread.sleep(2000);
		WebElement displ=driver.findElement(By.xpath("//h1[text()='2 gram 24 KT Lakshmi Gold Coin']"));
		//if(disp.getText())
		System.out.println(displ.getText());
		driver.close();
	}

}
//verify