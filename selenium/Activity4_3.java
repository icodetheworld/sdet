package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
	
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		System.out.println("Title :"+driver.getTitle());
		WebElement first  = driver.findElement(By.xpath("//h3[@id = 'third-header']"));
		System.out.println("third header text : "+first.getText());
		WebElement second  = driver.findElement(By.xpath("//h5"));
		System.out.println("Color of fifth header : "+second.getCssValue("color"));
		WebElement third = driver.findElement(By.xpath("//button[contains(text(),'Violet')]"));
		System.out.println("Classes of Violet button on the left : "+third.getAttribute("class"));
        WebElement fourth = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
		System.out.println("Grey Button : "+fourth.getText());
		
		driver.close();
	}
}
