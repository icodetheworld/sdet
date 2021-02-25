import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void Test() {
        WebElement header = driver.findElement(By.xpath("//*[@id=\"post-16\"]/header/h1"));
        System.out.println("Page header is: " + header.getText());
        Assert.assertEquals("Welcome to Alchemy Jobs", header.getText());
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}