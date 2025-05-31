package assignment.day3;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver1= new EdgeDriver();
		
         // Loading the URL
		driver.get("https://www.facebook.com/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		//Closing the browser
		driver.close();
	}

}
