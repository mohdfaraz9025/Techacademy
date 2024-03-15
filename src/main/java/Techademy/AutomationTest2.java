package Techademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTest2 {

    public static void main(String[] args) throws Exception{
        
        System.setProperty("webdriver.chrome.driver", "D:\\Jarfiles\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); 
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.automationanywhere.com/");
        
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();


        WebElement requestDemoButton = driver.findElement(By.xpath("//a[@title='Request demo']"));
        requestDemoButton.click();

        String expectedUrl = "https://www.automationanywhere.com/request-live-demo";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Successfully navigated to the Request Live Demo page.");
        } else {
            System.out.println("Navigation to the Request Live Demo page failed.");
        }

        WebElement firstNameLabel = driver.findElement(By.xpath("//label[contains(text(),'First Name')]"));
        WebElement lastNameLabel = driver.findElement(By.xpath("//label[contains(text(),'Last Name')]"));

        System.out.println("First Name Label: " + firstNameLabel.getText());
        System.out.println("Last Name Label: " + lastNameLabel.getText());

        driver.quit();
    }
}
