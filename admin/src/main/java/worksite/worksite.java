package worksite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.messages.types.Duration;

public class worksite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://fmgdevportals.hyperbig.com/login");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("(//input[@name='email'])[3]")).click(); 
		driver.findElement(By.xpath("(//input[@name='email'])[3]")).sendKeys("manager2@blaze.ws");
		driver.findElement(By.xpath("(//input[@name='password'])[3]")).sendKeys("Mt12345!");
		driver.findElement(By.xpath("(//button[contains(@class,'btn btn-primary')])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'row gap-2')]//button)[1]")).click();
		driver.findElement(By.id("phoneNumber")).sendKeys("905103724");
		driver.findElement(By.id("workerName")).sendKeys("logan");
		driver.findElement(By.id("workerDob")).sendKeys("30/07/1999");
		//driver.findElement(By.xpath("//div[normalize-space(text())='Completed']")).click();
		driver.findElement(By.id("workOrderNumber")).sendKeys("535435");
		// {
		     // WebElement element = driver.findElement(By.cssSelector(".btn-lg"));
		//    //  Actions builder = new Actions(driver);
		     // builder.moveToElement(element).perform();
		 //   }
		 //   {
		    ////  WebElement element = driver.findElement(By.tagName("body"));
		    //  Actions builder = new Actions(driver);
		    //  builder.moveToElement(element, 0, 0).perform();
		   // }
		    driver.findElement(By.id("checkIn")).click();
		    driver.findElement(By.cssSelector(".react-datepicker__day--keyboard-selected")).click();
		    //{
		     // WebElement element = driver.findElement(By.cssSelector(".react-datepicker__time-list-item:nth-child(797)"));
		     // builder = new Actions(driver);
		     // builder.moveToElement(element).clickAndHold().perform();
		    //}
		   // {
		     // WebElement element = driver.findElement(By.cssSelector(".react-datepicker__time-list-item:nth-child(797)"));
		     // Actions builder = new Actions(driver);
		    //  builder.moveToElement(element).perform();
		   // }
		   // {
		     // WebElement element = driver.findElement(By.cssSelector(".react-datepicker__time-list-item:nth-child(797)"));
		     // Actions builder = new Actions(driver);
		     // builder.moveToElement(element).release().perform();
		   // }
			 //45!driver.manage().timeouts().implicitlyWait("Duration.of Seconds(10)");
		driver.findElement(By.cssSelector(".react-datepicker__time-list-item:nth-child(797)")).click();
	Thread.sleep(2000);
	    driver.findElement(By.id("checkOut")).click();
	   driver.findElement(By.cssSelector(".react-datepicker__day--keyboard-selected")).click();
	driver.findElement(By.cssSelector(".react-datepicker__time-list-item:nth-child(801)")).click();
	    driver.findElement(By.cssSelector(".close > .pg-icon")).click();
		    driver.findElement(By.xpath("(//span[contains(@class,'title line-height-40')])[2]")).click();
          driver.findElement(By.xpath("//div[@class='pr-2 m-r-10']//button[1]")).click();
          driver.findElement(By.xpath("//div[@class='input-group']//input[1]")).sendKeys("123456");
		driver.quit();
	}

}
