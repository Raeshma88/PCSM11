package basic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.naukri.com/");
		//driver.manage().window().maximize();
		/*String title=driver.getTitle();
		System.out.println(title);
		System.out.println("title is: "+driver.getTitle());
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		*/
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();
		System.out.println("am parent: "+parent);
		Set<String> wins=driver.getWindowHandles();
		wins.remove(parent);
		for(String win:wins)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			driver.close();
		}
		//driver.close();

	}

}
