package automationFramework;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {
	public static void main(String []args)throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		
		List<WebElement> column = driver.findElements(By.xpath("//table[contains(@class, 'sortableTable')]/tbody/tr[1]/td"));
		List<WebElement> row = driver.findElements(By.xpath("//table[contains(@class, 'sortableTable')]/tbody/tr"));
		
		System.out.println("Number of Columns in the table : "+column.size());
		System.out.println("Number of Rows in the table : "+row.size());
		
		WebElement ss = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("Second Column Second Value : "+ss.getText());
		
		driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]")).click();
		
		ss = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("Second Column Second Value : "+ss.getText());
		
		driver.close();
	}
}
