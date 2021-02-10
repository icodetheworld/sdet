package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity3 {
	
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println(driver.getTitle());
		
		WebElement firstname  = driver.findElement(By.id("firstName"));
		WebElement lastname  = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement contact = driver.findElement(By.id("number"));
		firstname.sendKeys("Shagal");
		lastname.sendKeys("Sajid");
		email.sendKeys("email@email.com");
		contact.sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
