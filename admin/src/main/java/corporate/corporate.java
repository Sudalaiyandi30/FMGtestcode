package corporate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class corporate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("https://fmgdevportals.hyperbig.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//li[contains(@class,'nav-item ')]//a)[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'form-group ')])[3]")).click();
		   driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div/div[2]/div/div/div")).click();
		   driver.findElement(By.xpath("(//div[contains(@class,'form-group ')])[3]")).click(); 
		   driver.findElement(By.xpath("(//div[contains(@class,'form-group ')]//input)[3]")).sendKeys("corporate2@blaze.ws");
		   driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("Ct12345!");
		   driver.findElement(By.xpath("(//div[contains(@class,'col-md-6 d-flex')]//button)[2]")).click();
		   Thread.sleep(3000);
		    driver.findElement(By.cssSelector(".btn-lg")).click();
		    Thread.sleep(3000);
		   // {
		   //   WebElement element = driver.findElement(By.cssSelector(".btn-lg"));
		   //   Actions builder = new Actions(driver);
		   //   builder.moveToElement(element).perform();
		  //  }
		 //   {
		   //   WebElement element = driver.findElement(By.tagName("body"));
		   //   Actions builder = new Actions(driver);
		   //   builder.moveToElement(element, 0, 0).perform();
		    //}
		   // driver.findElement(By.cssSelector(".css-1a7sr4f-control > .css-1hwfws3")).click();
		   // driver.findElement(By.xpath("//form/div/div/div/div/div/div[2]/div/div")).click();
		    driver.findElement(By.id("phoneNumber")).click();
		    driver.findElement(By.id("phoneNumber")).sendKeys("9025103724");
		    driver.findElement(By.id("workerName")).click();
		    driver.findElement(By.id("workerName")).sendKeys("jimmy");
		    driver.findElement(By.id("workerDob")).click();
		    driver.findElement(By.id("workerDob")).sendKeys("08301999");
		    //driver.findElement(By.cssSelector(".css-1a7sr4f-control > .css-1hwfws3")).click();
		    //driver.findElement(By.id("react-select-5-option-1")).click();
		    driver.findElement(By.id("workOrderNumber")).click();
		    driver.findElement(By.id("workOrderNumber")).sendKeys("12345678");
		    driver.findElement(By.id("checkIn")).click();
		    driver.findElement(By.cssSelector(".react-datepicker__day--keyboard-selected")).click();
             Thread.sleep(3000);
            driver.findElement(By.cssSelector(".react-datepicker__time-list-item:nth-child(1077)")).click();
		    driver.findElement(By.id("checkOut")).click();
		   // driver.findElement(By.cssSelector(".react-datepicker__day--keyboard-selected")).click();
		    //driver.findElement(By.cssSelector(".react-datepicker__time-list-item:nth-child(1080)")).click();
		    //driver.findElement(By.cssSelector(".close > .pg-icon")).click();
		   // driver.findElement(By.cssSelector("li:nth-child(2) .title")).click();
		    //driver.findElement(By.cssSelector(".pr-2 > .btn-primary")).click();
		   // {
		      //WebElement element = driver.findElement(By.cssSelector(".pr-2 > .btn-primary"));
		    //  Actions builder = new Actions(driver);
		     // builder.moveToElement(element).perform();
		   // }
		   // {
		     // WebElement element = driver.findElement(By.tagName("body"));
		    //  Actions builder = new Actions(driver);
		     // builder.moveToElement(element, 0, 0).perform();
		   // }
		    driver.findElement(By.cssSelector(".css-1a7sr4f-control > .css-1hwfws3")).click();
		    driver.findElement(By.id("react-select-7-option-0")).click();
		    driver.findElement(By.cssSelector(".mb-3 > .form-control")).click();
		    driver.findElement(By.cssSelector(".mb-3 > .form-control")).sendKeys("12345678");
		    driver.findElement(By.cssSelector(".close > .pg-icon")).click();
		    driver.findElement(By.cssSelector("li:nth-child(6) .title")).click();
		    driver.findElement(By.cssSelector(".btn-lg:nth-child(1)")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector(".btn-lg:nth-child(1)"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    driver.findElement(By.id("managerEmail")).sendKeys("corporate2@blaze.ws");
		    driver.findElement(By.id("managerPassword")).sendKeys("Ct12345!");
		    driver.findElement(By.id("storeNumber")).click();
		    driver.findElement(By.id("storeNumber")).sendKeys("1234");
		    driver.findElement(By.id("storeName")).click();
		    driver.findElement(By.id("storeName")).click();
		    driver.findElement(By.id("storeName")).click();
		    driver.findElement(By.id("storeName")).sendKeys("domino");
		    driver.findElement(By.id("address")).click();
		    driver.findElement(By.id("address")).sendKeys("jersey");
		    driver.findElement(By.id("address2")).click();
		    driver.findElement(By.id("address2")).sendKeys("new jersey");
		    driver.findElement(By.id("city")).click();
		    driver.findElement(By.id("city")).sendKeys("new jersey");
		    driver.findElement(By.id("state")).click();
		    driver.findElement(By.id("state")).sendKeys("usa");
		    driver.findElement(By.id("zip")).click();
		    driver.findElement(By.id("zip")).sendKeys("90909");
		    driver.findElement(By.cssSelector(".css-1hwfws3")).click();
		    driver.findElement(By.id("react-select-8-option-1")).click();
		    driver.findElement(By.id("managerName")).click();
		    driver.findElement(By.id("managerName")).sendKeys("jimmycart");
		    driver.findElement(By.cssSelector(".close > .pg-icon")).click();
		   driver.quit();
	}

}
