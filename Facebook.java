package assignment.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
	ChromeDriver driver =new ChromeDriver(opt);
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Create new account")).click();
	//firstname
	driver.findElement(By.name("firstname")).sendKeys("Kaviarasu");
	driver.findElement(By.name("lastname")).sendKeys("K");
	
	//Date
	WebElement date = driver.findElement(By.id("day"));
	Select dropdown=new Select(date);
	dropdown.selectByIndex(4);
	
	//Month
     WebElement month = driver.findElement(By.id("month"));
     Select dropdown1=new Select(month);
     dropdown1.selectByValue("3");
		
		//year
	 WebElement year = driver.findElement(By.id("year"));
	 Select dropdown2=new Select(year);
	 dropdown2.selectByVisibleText("1992");
	 
	 //sex
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[2]/label\r\n"
	  		+ "")).click();
	  
	  //Mobile or email
	  driver.findElement(By.name("reg_email__")).sendKeys("9092513601");
	  
      driver.close();
		

	}

}
