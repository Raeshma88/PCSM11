package demoTestng;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class Demo3 {
		WebDriver driver;
		
		@BeforeMethod
		public void bM() {
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com/");
			System.out.println("BM");
		}
		@Test
		public void tc_01() throws InterruptedException
		{
			
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
			System.out.println("TC1");
		}
		@Test
		public void tc_02() throws InterruptedException
		{
			
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("testng",Keys.ENTER);
			System.out.println("TC2");
		}
		@AfterMethod
		public void aM() {
			driver.close();
			System.out.println("AM");
		}

	}
