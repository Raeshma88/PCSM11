package basic;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class multioptn {
public static void main(String [] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/Desktop/multiple.html");
	driver.manage().window().maximize();
	WebElement ele=driver.findElement(By.xpath("//select[@id='b']"));
	Select s=new Select(ele);
	if(s.isMultiple())
	{
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("322");
		Thread.sleep(1000);
		s.selectByVisibleText("324");
	}
	List<WebElement> values=s.getOptions();
	for(WebElement value:values)

	{
		System.out.println(value.getText());
	}
	Thread.sleep(2000);
	System.err.println(s.getFirstSelectedOption().getText());
	/*s.deselectByValue("322");
	Thread.sleep(1000);
	s.deselectByIndex(0);
	Thread.sleep(1000);
	s.deselectByVisibleText("324");*/
	s.deselectAll();
}
}