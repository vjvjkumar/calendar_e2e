package Pack1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.AcceptAlert;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class TestsAlertsVJ {
	
@Test

public void testsalerts() throws InterruptedException{
	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Thread.sleep(3000);
	
	driver.get("http://rediff.com");
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
	Thread.sleep(3000);
	
	Alert alt=driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
	// OR
	// alt.dismiss(); means it'll click on cancel button of the Test Alert window 
	

}
}