package Pack1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextAreaBoxVJ {
	
	@Test
	public void testareabox() throws InterruptedException{

	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Thread.sleep(3000);
		
	//driver.get("http://rediff.com");//
	//driver.findElement(By.linkText("Sign in")).click();//
	
	driver.get("http://tizag.com");
	driver.findElement(By.linkText("HTML Tutorial")).click();
	driver.findElement(By.linkText("HTML - Textareas")).click();
	
	driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/textarea[1]")).clear();
	
	// the above code or syntax will clear() the existing text before writing a new text in the Text-Area-Box. 
	// The bottom code is new text after clearing the existing text with the above clear() code. 
	
	driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/textarea[1]")).sendKeys("Vijay should be the king of selenium");

	}
}
