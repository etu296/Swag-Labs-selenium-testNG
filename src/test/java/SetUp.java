import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SetUp {
    WebDriver driver;
    @BeforeTest
    public void driverSetUp() throws Exception
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ibos\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        Thread.sleep(1000);
        // visit website
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
        // login
        //enter username
        List<WebElement> userName = driver.findElements(By.id("user-name"));
        userName.get(0).sendKeys("standard_user");
        Thread.sleep(1000);
        //enter password
        List<WebElement> password = driver.findElements(By.id("password"));
        password.get(0).sendKeys("secret_sauce");
        Thread.sleep(1000);
        //click ok login button
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
    }

//    @Test (priority = 0, description = "login into the website with valid credensial")
//
//    public void logIn() throws Exception
//    {
//        // visit website
//        driver.get("https://www.saucedemo.com/");
//        Thread.sleep(1000);
//        // login
//        //enter username
//        List<WebElement> userName = driver.findElements(By.id("user-name"));
//        userName.get(0).sendKeys("standard_user");
//        Thread.sleep(1000);
//        //enter password
//        List<WebElement> password = driver.findElements(By.id("password"));
//        password.get(0).sendKeys("secret_sauce");
//        Thread.sleep(1000);
//        //click ok login button
//        driver.findElement(By.id("login-button")).click();
//        Thread.sleep(2000);
//    }



}
