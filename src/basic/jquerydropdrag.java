package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jquerydropdrag {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(drag,drop).build().perform();
		System.out.println(drop.getText());
		//
		String pro=drop.getCssValue("background-color");
		System.out.println(pro);
		System.out.println(drop.getCssValue("font-size"));
		System.out.println(drag.getAttribute("class"));
		
}
}
