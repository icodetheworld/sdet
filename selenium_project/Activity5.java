import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
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
       Assert.assertEquals("Jobs – Alchemy Jobs", driver.getTitle());
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}