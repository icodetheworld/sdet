import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @Test
    public void Test() {
        WebElement img = driver.findElement(By.xpath("//*[@id=\"post-16\"]/header/div/img"));
        System.out.println("Source of the image: " + img.getAttribute("src"));
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}