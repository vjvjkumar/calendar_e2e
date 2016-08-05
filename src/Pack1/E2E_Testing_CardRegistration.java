package Pack1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class E2E_Testing_CardRegistration {
	
	@Test
	public void E2E_CardRegistration() throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("http://hdfcbank.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("html/body/div[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div/div[2]/img[1]")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div/div[2]/div[1]/div/div/a[1]/img")).click();
		
		Set<String> allwindowids = driver.getWindowHandles();
		Iterator<String> iter = allwindowids.iterator();
		
		String mainwindow = iter.next();
		String newwindow = iter.next();
		driver.switchTo().window(newwindow);
		
		
		//driver.findElement(By.xpath(".//*[@id='ddlExistingCardHeld']")).click();//
		
		//List<WebElement> Options=driver.findElements(By.tagName("HSBC"));//
		
		driver.findElement(By.id("ddlExistingCardHeld")).click();
		driver.findElement(By.xpath(".//*[@id='ddlExistingCardHeld']/option[5]")).click();
		
		driver.findElement(By.xpath(".//*[@id='ddlCCMaxLimit']")).sendKeys("<15000");
		
		driver.findElement(By.xpath(".//*[@id='txtFName']")).sendKeys("vijay");
		driver.findElement(By.xpath(".//*[@id='txtLName']")).sendKeys("kumar");
		
		
		driver.findElement(By.xpath(".//*[@id='txtDateOfBirth']")).click();	
		
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div")).click();
		//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]")).sendKeys("Mar");
		//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]")).sendKeys("1978");
		
		Select select = new Select(driver.findElement(By.xpath("html/body/div[4]/div/div/select[1]/option[3]"))); 
		select.selectByValue("1978");
					
	List<WebElement> dateBox=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody"));
		
		System.out.println(dateBox.size());
		
	for(int i=0; i<=dateBox.size()-1; i++){
		String date = dateBox.get(i).getText();
			if(date.equals("3"))	{
			dateBox.get(i).click();
			break;
			}
		} 			
		
	
		 			
		//driver.findElement(By.xpath(".//*[@id='txtDateOfBirth']")).click();
		//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]")).click();
		//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]/option[1]")).click();
		//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]")).click();
		//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]/option[75]")).click();
		//driver.findElement(By.linkText("1")).click();
		
		driver.findElement(By.xpath(".//*[@id='txtSTD_Off']")).sendKeys("020");
		driver.findElement(By.xpath(".//*[@id='txtOffNo']")).sendKeys("85623456");
		driver.findElement(By.xpath(".//*[@id='txtExtnNo']")).sendKeys("1234");
		driver.findElement(By.xpath(".//*[@id='txtMobileNo']")).sendKeys("0123456789");
		driver.findElement(By.xpath(".//*[@id='txtEmailId']")).sendKeys("vijay.t.vj@gmail.com");
		driver.findElement(By.xpath(".//*[@id='txtPAN']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='ddlCity']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath(".//*[@id='ddlAddrProof']")).sendKeys("Passport copy");
		
		driver.findElement(By.xpath(".//*[@id='ddlEmpType']")).click();
		driver.findElement(By.xpath(".//*[@id='ddlEmpType']/option[2]")).click();
		driver.findElement(By.xpath(".//*[@id='txtCompany']")).sendKeys("deloitte");
		driver.findElement(By.xpath(".//*[@id='ddlNetIncome']")).click();
		driver.findElement(By.xpath(".//*[@id='ddlNetIncome']/option[2]")).click();
		
		driver.findElement(By.xpath(".//*[@id='txtSTD_Res']")).sendKeys("020");
		driver.findElement(By.xpath(".//*[@id='txtResNo']")).sendKeys("23456789");
		driver.findElement(By.xpath(".//*[@id='accHolderY']")).click();
		driver.findElement(By.xpath(".//*[@id='rdoAppliedCCY']")).click();
		
		driver.findElement(By.xpath(".//*[@id='divchkAuthorize']")).click();
		driver.findElement(By.xpath(".//*[@id='txtCaptchaCode']")).sendKeys("rFZLh8");
		driver.findElement(By.id("btnSubmit")).click();
	}

}
