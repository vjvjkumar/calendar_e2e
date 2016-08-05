package Pack1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsVJ {
	
@Test

public void radiobuttons() throws InterruptedException{
	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Thread.sleep(3000);
	
	driver.get("http://tizag.com");
	driver.findElement(By.linkText("HTML Tutorial")).click();
	driver.findElement(By.linkText("HTML - Radio")).click();
	driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[1]")).click();
			
}


}
