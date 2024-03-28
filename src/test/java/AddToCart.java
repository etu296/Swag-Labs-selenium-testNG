import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddToCart extends SetUp{
    @Test(priority = 1, description = "scroll up down the website view some product")
    public void scrollUpDown() throws Exception
    {
        //scroll Down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
        //scroll up
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(document.body.scrollHeight , 0)");
        Thread.sleep(1000);
        // Wait for a few seconds to see the scroll action
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        // view product
        driver.findElement(By.id("item_0_img_link")).click();
        Thread.sleep(3000);
        // back to product
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(1000);
    }

    @Test(priority = 2, description = "change filter then add some product in my cart & view cart")
    public void addCart() throws Exception
    {
        // select filter price low to high
        WebElement dropdownElement = driver.findElement(By.className("product_sort_container"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Price (low to high)");
        Thread.sleep(2000);
        // change filter
        WebElement dropdownElement2 = driver.findElement(By.className("product_sort_container"));
        Select dropdown2 = new Select(dropdownElement2);
        dropdown2.selectByVisibleText("Name (Z to A)");
        Thread.sleep(2000);
        //view product
        driver.findElement(By.id("item_4_img_link")).click();
        Thread.sleep(2000);
        //add to cart
        driver.findElement(By.id("add-to-cart")).click();
        Thread.sleep(2000);
        //view cart
        driver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 3, description = "remove item from cart")
    public  void removeProductFromCart() throws Exception
    {
        //remove product
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        // go to all item
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("inventory_sidebar_link")).click();
        Thread.sleep(2000);
        //view product
        driver.findElement(By.id("item_4_img_link")).click();
        Thread.sleep(2000);
        //again add to cart
        driver.findElement(By.id("add-to-cart")).click();
        Thread.sleep(2000);
        // back to product
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(1000);
        // view product
        driver.findElement(By.id("item_0_img_link")).click();
        Thread.sleep(3000);
        //again add to cart
        driver.findElement(By.id("add-to-cart")).click();
        Thread.sleep(2000);
        //view cart
        driver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(2000);

    }
    @Test(priority = 4, description = "continue shopping then select filter & change filter")
    public  void continueShopping() throws Exception
    {
//        // view product
//        driver.findElement(By.id("item_0_img_link")).click();
//        Thread.sleep(3000);
//        //again add to cart
//        driver.findElement(By.id("add-to-cart")).click();
//        Thread.sleep(2000);
//        //view cart
//        driver.findElement(By.id("shopping_cart_container")).click();
//        Thread.sleep(2000);
        // click on continue shopping
        driver.findElement(By.id("continue-shopping")).click();
        Thread.sleep(3000);
        //again add to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        Thread.sleep(2000);

    }

}
