package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
	public static void main(String args[])throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title=driver.getTitle();
		System.out.println("Title of the Website : "+title);
		
		WebElement IdAbout = driver.findElement(By.id("about-link"));
		System.out.println("By ID :"+IdAbout.getText());
		
		WebElement ClassAbout = driver.findElement(By.className("green"));
		System.out.println("By Class :"+ClassAbout.getText());
		
		WebElement TextAbout = driver.findElement(By.linkText("About Us"));
		System.out.println("By LinkText :"+TextAbout.getText());
		
		WebElement CssAbout = driver.findElement(By.cssSelector(".green"));
		System.out.println("By CssSelector :"+CssAbout.getText());
		
		Thread.sleep(2000);
		driver.close();
			

	}
}
