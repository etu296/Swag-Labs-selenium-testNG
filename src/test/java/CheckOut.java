import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class CheckOut extends AddToCart{
    @Test(priority = 5,description = "checkout & take a screenshot of checkout overview and finish the process then back to home")
    public  void checkOut() throws Exception
    {
        // add to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        Thread.sleep(2000);
        //view cart
        driver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(2000);
        //click on check out
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
        // fill up the form
        List<WebElement> firstName = driver.findElements(By.id("first-name"));
        firstName.get(0).sendKeys("Etu Mahmuda");
        Thread.sleep(2000);
        List<WebElement> lastName = driver.findElements(By.id("last-name"));
        lastName.get(0).sendKeys("Era");
        Thread.sleep(2000);
        List<WebElement> postalCode = driver.findElements(By.id("postal-code"));
        postalCode.get(0).sendKeys("7701");
        Thread.sleep(2000);
        // click on continue button
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        // take a screenshot from the overview page
        File screenShot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        // save to desktop
        FileUtils.copyFile(screenShot1,new File("C:\\Users\\ibos\\OneDrive\\Desktop\\s2.png"));
        Thread.sleep(2000);
        // click on finish shopping
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
        //click on back to home
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(2000);

    }
}
