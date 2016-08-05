package Pack1;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar_Handling {

	@Test
	public void google() throws Exception{
	
		WebDriver driver=new FirefoxDriver();
		driver.get("http://redbus.in");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/section/div[2]/div[1]/input")).click();
		Thread.sleep(3000);

		List<WebElement> dates=driver.findElements(By.xpath("//*[@id='rbcal_txtOnwardCalendar']/table[1]//td"));
		
		System.out.println(dates.size());

		for(int i=0; i<=dates.size()-1; i++){
		
			String date=dates.get(i).getText();
			
			if(date.equals("20")){
			dates.get(i).click();
			break;
			}
}	
}
}

	

