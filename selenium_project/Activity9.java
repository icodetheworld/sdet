import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
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
		
		driver.findElement(By.xpath("//*[@id=\"menu-posts-job_listing\"]/a/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[4]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div/div/div/div[1]/button")).click();
		WebElement input = driver.findElement(By.xpath("//*[@id=\"post-title-0\"]"));
		Thread.sleep(1000);
		input.sendKeys("hello world");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[1]/div/div[1]/div/div[2]/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div/button")).click();
		Thread.sleep(2000);
		WebElement alert = driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[1]/div/div[2]/div[1]/div[3]/div/div/div/div"));
		Assert.assertEquals("Post published. View Job", alert.getText());
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}