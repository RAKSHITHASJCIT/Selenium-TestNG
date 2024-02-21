package uitestng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firsttest {

		
	ChromeDriver driver = new ChromeDriver();
    @Test(priority = 1,groups ="driversetup" )
	public void login()
	{
    	System.out.println("login successfull hh");
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakshi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	
	}
    @Test(priority = 2 ,groups = "login")
    public void url()
    {
    	String expectedtitle = "Google";
    	
    	driver.get("https:\\www.google.com");
    	driver.manage().window().maximize();
    	String actualtitle = driver.getTitle();
    	
    	Assert.assertEquals(actualtitle, expectedtitle);
    	
    	//Assert.assertTrue(true, actualtitle);
    	
    	//Assert.fail();
    }
    @Test(priority = 3 ,groups ="close")
    public void close() {
    
    	
    	driver.close();
    	
    }
    
    
}
