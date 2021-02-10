package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("Title :"+driver.getTitle());
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
		WebElement password2 = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));
		WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
		
		username.sendKeys("admin2");
		password.sendKeys("password2");
		password2.sendKeys("password2");
		email.sendKeys("password2@password2.com");
		driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
		System.out.println("Sign Up message is :"+driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]")).getText());
		
		driver.close();
	}
}
