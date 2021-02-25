import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin"); 
    }

    @Test
    public void Test() throws InterruptedException {

		WebElement Username = driver.findElement(By.id("user_login"));
		WebElement Password = driver.findElement(By.id("user_pass"));
		Username.sendKeys("root");
		Password.sendKeys("pa$$w0rd");
		WebElement loginbutton = driver.findElement(By.xpath("//input[@value='Log In']"));
		loginbutton.click();
		Thread.sleep(5000);
		WebElement loggedin = driver.findElement(By.xpath("//div[contains(text(),'Dashboard')]"));
		Assert.assertTrue(loggedin.isDisplayed());
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}