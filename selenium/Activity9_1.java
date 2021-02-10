package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {
	public static void main(String args[]) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		Select drop =new Select(driver.findElement(By.xpath("//*[@id=\"single-select\"]")));
		WebElement val= driver.findElement(By.xpath("//*[@id=\"single-value\"]"));
		
		drop.selectByVisibleText("Option 2");
		System.out.println("Selecting second option using selectByVisibleText() : "+val.getText());
		
		drop.selectByIndex(3);
		System.out.println("Selecting third option using selectByIndex() : "+val.getText());
		
		drop.selectByValue("4");
		System.out.println("Selecting fourth option using selectByValue() : "+val.getText());
		
		System.out.println("Options listed");
		List<WebElement> options = drop.getOptions();
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		driver.close();		
	}
}
