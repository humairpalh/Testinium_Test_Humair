package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.BaseUrl;

public class Product_Page extends BaseUrl{
	@Test(priority=3)
	public void product() throws InterruptedException {
		
		//Selecting the Product
		  JavascriptExecutor js1 = (JavascriptExecutor) driver;
		  js1.executeScript("window.scrollBy(0, 4500)", "");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]")).click();
		 
		  driver.findElement(By.xpath("//a[contains(text(),'FHD Touch Disp')]")).click();
		  Thread.sleep(2000);
		  //Add To Cart
		  driver.findElement(By.xpath("//body/div[@id='container']/div[@id='root']/div[@id='block-o1b-XZ8ElL']/div[@id='block-Pvty24-PCy']/div[@id='block-gPt-1r6bsq']/div[@id='block-epgoLcDQG8I']/div[@id='module_add_to_cart']/div[1]/button[2]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[contains(text(),'GO TO CART')]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/span[1]/i[1]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[2]/span[1]/i[1]")).click();
		  
		  //Deleted Product
		  driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/span[2]/span[1]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[contains(text(),'REMOVE')]")).click();
		  System.out.println("Cart Empty Successfully");
		  Thread.sleep(1000);
		  driver.navigate().to("https://www.daraz.pk/");
		
		
		
	}

}
