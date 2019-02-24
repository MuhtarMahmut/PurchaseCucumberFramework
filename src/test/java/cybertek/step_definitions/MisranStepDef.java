package cybertek.step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cybertek.pages.everyone_pages.MisranWebElementPage;
import cybertek.utilities.BrowserUtils;
import cybertek.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MisranStepDef {

    MisranWebElementPage ME = new MisranWebElementPage();
    public WebDriverWait wait=new WebDriverWait(Driver.getDriver(),100);

    @When("user click Requests for Quotation")
    public void user_click_Requests_for_Quotation() {
        BrowserUtils.waitForClickablility(ME.Requests_for_Quotation, 10).click();
    }

    @Then("user should see create button")
    public void user_should_see_create_button() {
        Assert.assertTrue(ME.create.isDisplayed());
    }

    @Then("when user click create button")
    public void when_user_click_create_button() {
        BrowserUtils.highlightElement(BrowserUtils.waitForClickablility(ME.create, 10)).click();
    }

    @Then("the order page should display")
    public void the_order_page_should_display() {
        Assert.assertTrue(BrowserUtils.waitForVisibility(ME.confirm_order, 10).isDisplayed());
    }

    @When("user click product button")
    public void user_click_product_button() {
        ME.products.click();
    }

    @Then("user should see product page")
    public void user_should_see_product_page() {
        Assert.assertTrue(BrowserUtils.waitForVisibility(ME.productsText, 10).isDisplayed());
    }

    @Then("the product details should display")
    public void the_product_details_should_display() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(BrowserUtils.waitForVisibility(ME.Apple_In_Ear_Headphones, 10).isDisplayed());
        Assert.assertTrue(BrowserUtils.waitForVisibility(ME.price, 10).isDisplayed());
    }

    @Then("Click product box")
    public void click_product_box() {
      ME.productBox.click();
    }

    @Then("products info should match")
    public void products_info_should_match() {
        String name1=ME.itemDiscription.getText();
        Driver.getDriver().navigate().back();
        Assert.assertTrue(ME.productonpage.getText().equals(name1));
    }

    @Then("Click Edit Button")
    public void click_Edit_Button() {
        ME.editButton.click();
    }

    @Then("Enter {string} to salex price box")
    public void enter_to_salex_price_box(String string) {
        for (int i=0; i<10;i++)
            ME.salesPriceBox.sendKeys(Keys.BACK_SPACE);
        ME.salesPriceBox.sendKeys(string);

    }

    @Then("Click save button")
    public void click_save_button() {
        ME.saveButton.click();
        Driver.getDriver().navigate().back();
    }

    @When("Click Vendor page.")
    public void click_Vendor_page() {
        ME.VendorPage.click();
        wait.until(ExpectedConditions.titleContains("Vendors"));
    }

    @Then("title of the page should contain {string}.")
    public void title_of_the_page_should_contain(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Vendors"));
    }




}
