package Fm.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class calls {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://fmgdevportals.hyperbig.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".nav-item:nth-child(1) > .text-center")).click();
	    driver.findElement(By.name("email")).click();
		   driver.findElement(By.xpath("//div[@id=\'root\']/div/div[2]/div/div[2]/div/div/div")).click();
		   driver.findElement(By.xpath("//input[@name=\'email\']")).sendKeys("geff@blaze.ws");
		    driver.findElement(By.name("password")).sendKeys("Gj12345!");
		  //  driver.findElement(By.cssSelector("#tab2hellowWorld .pg-icon")).click();//
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("(//button[contains(@class,'btn btn-primary')])[1]")).click();
		    driver.findElement(By.name("workerName")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.name("workerName")).sendKeys("victor");
		driver.quit();
}
}