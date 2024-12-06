package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Assert2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\prasa\\Documents\\geckodriver-v0.34.0-win64.exe");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
		
		
		
		
		
		
		
		
		
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		
		
		 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 
		 
		  for(int i=1;i<5;i++)
	       {
	        	 driver.findElement(By.id("hrefIncAdt")).click();
	       }
		  
		  Thread.sleep(1000);	
	        
	       driver.findElement(By.id("btnclosepaxoption")).click();
	       
	       Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
