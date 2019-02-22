package cybertek.step_definitions.sample;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cybertek.pages.everyone_pages.sample.AmazonHomePage;
import cybertek.pages.everyone_pages.sample.ProductListPage;
import cybertek.pages.everyone_pages.sample.ProductPage;
import cybertek.utilities.BrowserUtils;
import cybertek.utilities.Driver;
import org.junit.Assert;

public class AmazonStepDef {

    @When("user on the home page and search {string}")
    public void user_on_the_home_page_and_search(String item) {

        AmazonHomePage amazonHomePage = new AmazonHomePage();

        Driver.getDriver().get("https://www.amazon.com/");
        amazonHomePage.searchBox.sendKeys(item);
        amazonHomePage.go.click();

    }

    @Then("the item{string} should be displayed")
    public void the_item_should_be_displayed(String item) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(item));
    }

    @Then("click the first option")
    public void click_the_first_option() {

        ProductListPage productListPage = new ProductListPage();
        productListPage.firstOption.click();

    }

    @Then("click add to cart")
    public void click_add_to_cart() {

        ProductPage productPage = new ProductPage();
        productPage.addToCart.click();
        BrowserUtils.sleep(1);
        productPage.noThank.click();
        BrowserUtils.sleep(1);
    }
}
