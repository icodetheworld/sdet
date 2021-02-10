package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {
	public static void main(String args[]) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		WebElement multi = driver.findElement(By.xpath("//*[@id=\"multi-select\"]"));
		WebElement val = driver.findElement(By.xpath("//*[@id=\"multi-value\"]"));
		Select sel = new Select(multi);
		
		if(sel.isMultiple()) {
			
			sel.selectByVisibleText("Javascript");
			System.out.println("After Including JavaScript");
			System.out.println(val.getText());
			
			sel.selectByValue("node");
			System.out.println("After Including Node");
			System.out.println(val.getText());
			
			sel.selectByIndex(4);
			sel.selectByIndex(5);
			sel.selectByIndex(6);
			System.out.println("After Including 4,5 & 6");
			System.out.println(val.getText());
			
			sel.deselectByValue("node");
			System.out.println("After Excluding Node js");
			System.out.println(val.getText());
			
			sel.deselectByIndex(7);
			System.out.println("After Excluding 7");
			System.out.println(val.getText());
//			
		}
		driver.close();
	}
}
