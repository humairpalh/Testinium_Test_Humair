package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.BaseUrl;

public class Search_product extends BaseUrl {
	@Test(priority=2)
	public void search() throws InterruptedException {
		
		  //Searching Product
		  driver.findElement(By.xpath("//input[@id='q']")).sendKeys("Computer");
		  driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]")).click();
		  Thread.sleep(3000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0, 4500)", "");
		  Thread.sleep(1000);
		  //Click On pagination
		  driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]")).click();
		
		
	}

}
