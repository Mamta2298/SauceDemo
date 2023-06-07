package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;

import static BaseClass.BaseClass.driver;

public class LoginPage {

    private static final By username = By.cssSelector("#user-name");
    private static final By password = By.cssSelector("#password");
    private static final By login = By.cssSelector("#login-button");

    private static final By heading = By.xpath("//div[text()='Swag Labs']");



    public void enterUsername()
    {
        driver.findElement(username).sendKeys("standard_user");
    }
    public void enterPassword()
    {
        driver.findElement(password).sendKeys("secret_sauce");
    }
    public void login()
    {
        driver.findElement(login).click();
    }



    public void validateLoginPage()
    {
        Assert.assertEquals("heading is not valid",driver.findElement(heading).getText(),"Swag Labs");
    }


}
