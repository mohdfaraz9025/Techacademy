package Techademy;

 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationTest {
    public static void main(String[] args) throws Exception {
        
        System.setProperty("webdriver.chrome.driver", "D:\\Jarfiles\\chromedriver-win32\\chromedriver.exe");

       WebDriver driver= (WebDriver) new ChromeDriver();

        driver.manage().window().maximize(); 
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.automationanywhere.com/");
        
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        
        WebElement productsMenu = driver.findElement(By.xpath("//a[text()='Products']"));
        
        
        
        Actions actions = new Actions(driver);
        actions.moveToElement(productsMenu).perform();
        Thread.sleep(3000);


        WebElement processDiscoveryLink = driver.findElement(By.xpath("(//a[@href=\"/products/process-discovery\"])[1]"));
        processDiscoveryLink.click();

        String expectedUrl = "https://www.automationanywhere.com/products/process-discovery";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Navigation successful. URL is as expected.");
        } else {
            System.out.println("Navigation failed. Expected URL: " + expectedUrl + ", Actual URL: " + actualUrl);
        }

        driver.quit();
    }
}


	