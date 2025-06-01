package assignment.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateAccount {

	public static void main(String[] args) {
		
	//Precondition
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
	ChromeDriver driver =new ChromeDriver(opt);
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	
	//Requirement
	//Login to the Account
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	//CreateAccount
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester10");
	
	//Industry
	WebElement industry = driver.findElement(By.name("industryEnumId"));
	Select dropdown=new Select(industry);
	dropdown.selectByIndex(3);
	
	//ownershipEnumId
	WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
	Select dropdown1=new Select(ownership);
	dropdown1.selectByVisibleText("S-Corporation");
	
	//source
	//dataSourceId
	WebElement source = driver.findElement(By.id("dataSourceId"));
	Select dropdown2=new Select(source);
	dropdown2.selectByValue("LEAD_EMPLOYEE");
	
	// marketing campaign
	//marketingCampaignId
	WebElement marketingcampaign = driver.findElement(By.id("marketingCampaignId"));
	Select dropdown3=new Select(marketingcampaign);
	dropdown3.selectByIndex(6);
	
	//state/province
	WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
	Select dropdown4=new Select(state);
	dropdown4.selectByValue("TX");
	
	
	//Click on the create Button
	driver.findElement(By.className("smallSubmit")).click();
	
	 //driver.close();
	//Verify Account name
	WebElement accountname = driver.findElement(By.className("tabletext"));
	Assert.assertEquals(accountname.getClass(),"tabletext");
	 
	 driver.close();

	
	}

}
