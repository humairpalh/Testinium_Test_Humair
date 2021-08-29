package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseUrl;

public class Login_Page extends BaseUrl {
	
	@Test(priority=1)
	public void login() throws InterruptedException {
		
		  //Login Page
		  driver.findElement(By.xpath("//a[contains(text(),'login')]")).click();
		  Thread.sleep(2000);
		  //Email and Password
		  driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("humairpalh@live.com");
		  driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Testing321");
		  
		  //Click Login Button 
		  driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		  System.out.println("Login Successfull");
		  Thread.sleep(3000);
		
	}

}
