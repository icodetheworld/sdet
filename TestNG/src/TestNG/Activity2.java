package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    
    @Test
    public void first() {
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals("Target Practice", title);
    }
    
    @Test
    public void second() {
        //This test case will Fail
        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "yellow");
    }
    
    @Test (enabled = false)
    public void third(){
    	 String title = driver.getTitle();
         System.out.println("Page title is: " + title);
         Assert.assertEquals("Target Practice ", title);
    }
    
    @Test
    public void fourth() {
    	throw new SkipException("Skipping 4th testcase");
    }
    
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}