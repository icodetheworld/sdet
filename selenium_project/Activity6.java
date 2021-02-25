import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {
	
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void Test() {
       WebElement link = driver.findElement(By.xpath("//*[@id=\"menu-item-24\"]/a"));
       link.click();
       WebElement search = driver.findElement(By.xpath("//*[@id=\"search_keywords\"]"));
       search.sendKeys("Banking");
       driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/div[1]/div[4]/input")).click();
       try {
    	    Thread.sleep(2000);
    	} catch (InterruptedException e) {
    	    Thread.currentThread().interrupt();
    	    return;
    	}
       driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/ul/li/a")).click();
       driver.findElement(By.xpath("//*[@id=\"post-36\"]/div/div/div/div[3]/input")).click();
       System.out.println(driver.findElement(By.xpath("//*[@id=\"post-36\"]/div/div/div/div[3]/div/p/a")).getText());
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}