import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity7 {
	
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void Test() throws InterruptedException {
       WebElement link = driver.findElement(By.xpath("//*[@id=\"menu-item-26\"]/a"));
       link.click();
       WebElement email = driver.findElement(By.xpath("//*[@id=\"create_account_email\"]"));
       WebElement title = driver.findElement(By.xpath("//*[@id=\"job_title\"]"));
       WebElement type = driver.findElement(By.xpath("//*[@id=\"job_type\"]"));
       WebElement company = driver.findElement(By.xpath("//*[@id=\"company_name\"]"));
       
       email.sendKeys("check@123.com");
       title.sendKeys("title003");
       type.sendKeys("Type");
       WebElement description = driver.findElement(By.xpath("//iframe[@id='job_description_ifr']"));
       Thread.sleep(3000);
       description.sendKeys("This is line one.\n This is line two.");
       company.sendKeys("Company");
       WebElement url = driver.findElement(By.id("application"));
       url.sendKeys("https://google.com");
       WebElement preview = driver.findElement(By.xpath("//input[@value='Preview']"));
       preview.click();
       Thread.sleep(3000);
       WebElement submitlisting = driver.findElement(By.xpath("//input[@value='Submit Listing']"));
       submitlisting.click();
       
       WebElement joboption = driver.findElement(By.xpath("//ul[@id='primary-menu']//a[contains(text(),'Jobs')]"));
       joboption.click();

       Thread.sleep(6000);
       List<WebElement> results = driver.findElements(By.xpath("//ul[@class='job_listings']/li//a"));

       System.out.println("The list of results are : ");
       for (WebElement result : results) {
    	   System.out.println(result.getText());
       }
       String newpost = results.get(0).getText();
       if (newpost.contains("title003")) {
    	   System.out.println("The posted job is displaying in the list");
       }

    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}