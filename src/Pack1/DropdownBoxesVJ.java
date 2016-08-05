package Pack1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownBoxesVJ {
	
	@Test
	public void DropdownBoxesselect() throws InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		driver.get("http://ebay.co.uk");
		driver.findElement(By.id("gh-cat")).sendKeys("Crafts");
		driver.findElement(By.id("gh-btn")).click();
		
		
				
		
	}

}
