package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
	
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		System.out.println("Title :"+driver.getTitle());
		WebElement firstname  = driver.findElement(By.xpath("//input[@id = 'firstName']"));
		WebElement lastname  = driver.findElement(By.xpath("//input[@id = 'lastName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id = 'email']"));
		WebElement contact = driver.findElement(By.xpath("//input[@id = 'number']"));
		firstname.sendKeys("Shagal");
		lastname.sendKeys("Sajid");
		email.sendKeys("email@email.com");
		contact.sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
