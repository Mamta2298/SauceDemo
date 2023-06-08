package PageObjects;

import BaseClass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static BaseClass.BaseClass.driver;

public class DashboardPage extends BaseClass {

    private static By shoppingCart = By.xpath("//span[@class='shopping_cart_badge']");
    //button[@name='checkout']
     private static By firstName = By.id("first-name");
   private static By lastName = By.id("last-name");
    private static By postalCode = By.id("postal-code");
    private static By sumbit = By.xpath("//input[@value='Continue']");
    private static By checkout = By.xpath("//button[@name='checkout']");
    private static By products = By.xpath("//span[text()='Products']");
    private static By filter = By.xpath("//select[@class=\"product_sort_container\"]");
    private static By About = By.xpath("//a[text()='About']");
private static By menu = By.xpath("//button[text()='Open Menu']");
    public void clickOnAddToCart(String productName) {
        driver.findElement(By.xpath(" //div[text()='" + productName + "']/parent::a/parent::div/following-sibling::div/button\n")).click();
    }
    //button[text()='Remove']/parent::div/parent::div
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

    public void clickOnFilter(String filterText) {
        String value = "";
        if(filterText.equals("low to high"))
        {
            value="lohi";
        }
        else if(filterText.equals("A to Z"))
        {
            value="az";
        }

        WebElement dropdown = driver.findElement(filter);
        Select option = new Select(dropdown);

        option.selectByValue(value);
    }

    public void VerifyProductIsToggledToRemove(String productName) {
       String buttonText = driver.findElement(By.xpath(" //div[text()='" + productName + "']/parent::a/parent::div/following-sibling::div/button\n")).getText();
           Assert.assertEquals("Button Text was not verified","Remove",buttonText);
    }

    public void clickOnFilter() {
    }

    public void clickOnCheckout() {
        driver.findElement(checkout).click();
    }

    public void submitAddressDetails() {
        driver.findElement(firstName).sendKeys("Mahi");
        driver.findElement(lastName).sendKeys("sharma");
        driver.findElement(postalCode).sendKeys("440008");
        driver.findElement(sumbit).click();
    }

    public void validateUserIsOnSauceLabs() {
       WebElement heading = driver.findElement(By.xpath("//img[@alt='Saucelabs']"));
     if(heading.getAttribute("alt").equals("Saucelabs"))
     {
         System.out.println("user navigated to saucelabs page");
     }
     else {
         System.out.println("user not navigated to saucelabs page");
     }
    }

    public void clickOnAbout() {
        driver.findElement(About).click();
    }
    public void clickOnMenu()
    {
        driver.findElement(menu).click();
    }

    public void ValidateOrderAndPreview() {
        List<WebElement> info = driver.findElements(By.xpath("//div[@class=\"summary_info\"]/div"));
        for(WebElement I : info)
        {
            System.out.println(I.getText());
//            Assert.assertEquals("");
        }

    }

    public void verifyOrderDetails() {
        String[] listOfLabels = {"Payment Information","Shipping Information","Price Total"};
        int i = 0;
        List<WebElement> labels = driver.findElements(By.xpath("//div[@class=\"summary_info_label\"]"));
        for(WebElement L : labels)
        {
            Assert.assertEquals("label not present",listOfLabels[i],L.getText());
            i++;

        }
    }

    
}

