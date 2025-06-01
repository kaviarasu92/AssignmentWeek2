package assignment.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.Assert;
import org.openqa.selenium.WebElement;


public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver= new EdgeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximze the browser
		driver.manage().window().maximize();
		
		//Enter the username
		//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
          driver.findElement(By.xpath("//Input[@id='username']")).sendKeys("Demosalesmanager");
		// enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click on the lOGIN button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on the Linktext
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Create a Lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kaviarasu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		
		//generalProfTitle
		
		driver.findElement(By.name("generalProfTitle")).sendKeys("newsn");
		//smallSubmit
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//viewLead_generalProfTitle_sp
		WebElement accountname = driver.findElement(By.id("viewLead_generalProfTitle_sp"));
		Assert.assertEquals(accountname.getText(),"newsn");
		
		driver.close();
	}

}
