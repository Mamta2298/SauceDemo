package stepDefs;

import BaseClass.BaseClass;
import PageObjects.DashboardPage;
import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class  sauceDemoSteps extends BaseClass {

LoginPage loginPage = new LoginPage();
DashboardPage dashboardPage = new DashboardPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
      loginPage.validateLoginPage();

    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
      loginPage.enterUsername();
    }

    @When("user enters valid password")
    public void user_enters_valid_password() {
       loginPage.enterPassword();
    }

    @Then("user logs in successfully and Dashboard page is displayed")
    public void user_logs_in_successfully_and_dashboard_page_is_displayed() {
        loginPage.login();
dashboardPage.validateDashboardPage();
    }

    @Given("user select item bagpack and add it to cart")
    public void user_select_item_bagpack_and_add_it_to_cart() {

    }

    @When("user select item shirt and add it to cart")
    public void user_select_item_shirt_and_add_it_to_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

//    @Then("verify user successfully added {String} items in the cart")
//    public void verify_user_successfully_added_items_in_the_cart(String noOfItems) {
//
//    }

    @Then("verify add to cart button is toggled to remove button")
    public void verify_add_to_cart_button_is_toggled_to_remove_button() {

    }

    @Then("user is navigated to cart and checkout")
    public void user_is_navigated_to_cart_and_checkout() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user navigated to address details page and enters address")
    public void user_navigated_to_address_details_page_and_enters_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify user navigated to order preview page")
    public void verify_user_navigated_to_order_preview_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user clicks on finish button and navigated to order completion page")
    public void user_clicks_on_finish_button_and_navigated_to_order_completion_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify order is placed successfully")
    public void verify_order_is_placed_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user logs off successfully")
    public void user_logs_off_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("user select item {string} and add it to cart")
    public void userSelectItemAndAddItToCart(String item) {
        dashboardPage.clickOnAddToCart(item);
    }

    @Then("verify user successfully added {string} items in the cart")
    public void verifyUserSuccessfullyAddedItemsInTheCart(String productNameList) {
        dashboardPage.clickShoppingCart();
        dashboardPage.verifyItemPresentInCart(productNameList);
    }

    @Given("user clicks on filter dropdown")
    public void userClicksOnFilterDropdown() {
        
    }

    @And("select option low to high")
    public void selectOptionLowToHigh() {
        
    }

    @Then("verify that products are sorted as per selection")
    public void verifyThatProductsAreSortedAsPerSelection() {
    }
}
