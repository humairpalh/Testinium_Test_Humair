package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUrl {
	
	public static WebDriver driver;
	public static WebDriverWait wait;

		@BeforeSuite
		public void Wc_Intialize() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies(); //delete all cookies
		Thread.sleep(3000); //wait 3 seconds to clear cookies.
		
		driver.get("https://www.daraz.pk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		@AfterSuite
		public void setupClose() {
			System.out.println("Quitting everything !!");
			//driver.close();
		}

}
