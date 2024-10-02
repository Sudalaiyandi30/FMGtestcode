package Fm.admin;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adminpage {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		 
		driver.get("https://fmgdevportals.hyperbig.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".nav-item:nth-child(1) > .text-center")).click();
	    //driver.findElement(By.name("email")).click();
		   driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div/div[2]/div/div/div")).click();
		   driver.findElement(By.xpath("//input[@name=\'email\']")).sendKeys("geff@blaze.ws");
		    driver.findElement(By.name("password")).sendKeys("Gj12345!");
		  //  driver.findElement(By.cssSelector("#tab2hellowWorld .pg-icon")).click();//
		    driver.findElement(By.xpath("(//button[contains(@class,'btn btn-primary')])[1]")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("(//a[@class='detailed']//span)[2]")).click();
		    driver.findElement(By.cssSelector("li:nth-child(6) .title")).click();
		    driver.findElement(By.cssSelector(".btn-lg")).click();
		    driver.findElement(By.id("corporateName")).click();
		    driver.findElement(By.id("corporateName")).sendKeys("winson");
		    driver.findElement(By.id("corporatePhoneNumber")).click();
		    driver.findElement(By.id("corporatePhoneNumber")).sendKeys("9024103725");
		    driver.findElement(By.id("corporateTollFreeNumber")).click();
		    driver.findElement(By.id("corporateTollFreeNumber")).sendKeys("100100100");
		    driver.findElement(By.id("corporateEmail")).click();
		    driver.findElement(By.id("corporateEmail")).sendKeys("winsonn@blaze.ws");
		    driver.findElement(By.cssSelector(".close > .pg-icon")).click();
		    driver.findElement(By.xpath("//span[normalize-space(text())='Work Site']")).click();
		    driver.findElement(By.xpath("//div[@class='DTTT']//button[1]")).click();
		    driver.findElement(By.xpath("(//div[@class=' css-2b097c-container']//div)[1]")).click();
		    driver.findElement(By.xpath("(//div[@class=' css-1hwfws3']//div)[1]")).click();
		    //driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/form/div/div/div/div/div/div[2]/div")).click();
		    //List<WebElement> links = driver.findElements(By.tagName("a"));
		    Thread.sleep(3000);
		   // driver.findElement(By.id("react-select-2-option-1")).click();
		    driver.findElement(By.id("storeNumber")).click();
		    driver.findElement(By.id("storeNumber")).sendKeys("3243");
		    driver.findElement(By.id("storeName")).click();
		    driver.findElement(By.id("storeName")).sendKeys("domino\'s");
		    driver.findElement(By.id("address")).click();
		    driver.findElement(By.id("address")).sendKeys("los vegas");
		    driver.findElement(By.id("address2")).click();
		    driver.findElement(By.id("address2")).sendKeys("los vegas");
		    driver.findElement(By.id("city")).click();
		    driver.findElement(By.id("city")).sendKeys("los vegas");
		    driver.findElement(By.id("state")).click();
		    driver.findElement(By.id("state")).sendKeys("usa");
		    driver.findElement(By.id("zip")).click();
		    driver.findElement(By.id("zip")).sendKeys("1242");
		    //driver.findElement(By.cssSelector(".css-1wa3eu0-placeholder")).click();
		    //driver.findElement(By.id("react-select-3-option-1")).click();
		    driver.findElement(By.id("managerName")).click();
		    driver.findElement(By.id("managerName")).sendKeys("klinton");
		    driver.findElement(By.id("managerEmail")).click();
		    driver.findElement(By.id("managerEmail")).sendKeys("klinton@blaze.ws");
		    driver.findElement(By.cssSelector(".close > .pg-icon")).click();
		    Thread.sleep(3000);
		    driver.quit();
	}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
