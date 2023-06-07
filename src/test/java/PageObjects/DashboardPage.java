package PageObjects;

import BaseClass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static BaseClass.BaseClass.driver;

public class DashboardPage extends BaseClass {

    private static By shoppingCart = By.xpath("//span[@class='shopping_cart_badge']");
    //button[@name='checkout']
    private static By checkout = By.xpath("//button[@name='checkout']");
    private static By products = By.xpath("//span[text()='Products']");

    public void clickOnAddToCart(String productName) {
        driver.findElement(By.xpath(" //div[text()='" + productName + "']/parent::a/parent::div/following-sibling::div/button\n")).click();
    }
    public void validateDashboardPage()
    {
        Assert.assertEquals("heading is invalid",driver.findElement(products).getText(),"Products");

    }


    public void clickShoppingCart() {
        driver.findElement(shoppingCart).click();
    }

    public void verifyItemPresentInCart(String productNameList) {
        // List<String> actualProductText = null;
        List<WebElement> items = driver.findElements(By.xpath(" //div[@class='inventory_item_name']"));
        for (WebElement item : items) {
//            if (!productNameList.contains(item.getText())) {
                Assert.assertTrue("product is not present in the cart",productNameList.contains(item.getText()));
            }
        }

    }

