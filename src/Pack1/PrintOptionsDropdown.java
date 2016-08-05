package Pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PrintOptionsDropdown {
	@Test
	public void printoptionsdropdown() throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(3000); //java feature
		
		driver.get("http://ebay.co.uk");
		driver.findElement(By.id("gh-cat"));
		driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
		
				
		List<WebElement> Options=driver.findElements(By.tagName("option"));
		System.out.println("The Total Number of options in the dropdown box is: "+Options.size());
			for (int i=0; i<=Options.size()-1; i++)  {
				System.out.println(Options.get(i).getText());
			}
		}		
	}






