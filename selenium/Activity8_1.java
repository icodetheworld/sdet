package automationFramework;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {
	public static void main(String []args)throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		
		List<WebElement> column = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
		List<WebElement> row = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
		
		System.out.println("Number of Columns in the table : "+column.size());
		System.out.println("Number of Rows in the table : "+row.size());
		
		List<WebElement> third = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
		for(WebElement cellView:third) {
			System.out.println("Cell Values : "+cellView.getText());
		}
		WebElement ss = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
		System.out.println("Second Column Second Value : "+ss.getText());
		
		driver.close();
	}
}
