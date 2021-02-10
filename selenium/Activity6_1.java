package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title :"+driver.getTitle());
		
		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/label"));
		WebElement button = driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]"));
		
		button.click();
		wait.until(ExpectedConditions.invisibilityOf(checkBox));
		
		button.click();
		wait.until(ExpectedConditions.visibilityOf(checkBox));
		
		driver.close();
		
		
	}
}
