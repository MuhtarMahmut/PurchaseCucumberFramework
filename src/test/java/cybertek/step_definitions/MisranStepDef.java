package cybertek.step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cybertek.pages.everyone_pages.MisranWebElementPage;
import cybertek.utilities.BrowserUtils;
import org.junit.Assert;

public class MisranStepDef {

    @When("user click Requests for Quotation")
    public void user_click_Requests_for_Quotation() {

        MisranWebElementPage misranWebElementPage = new MisranWebElementPage();
        BrowserUtils.waitForClickablility(misranWebElementPage.Requests_for_Quotation, 10).click();
    }

    @Then("user should see create button")
    public void user_should_see_create_button() {

        MisranWebElementPage misranWebElementPage = new MisranWebElementPage();
        Assert.assertTrue(misranWebElementPage.create.isDisplayed());
    }

    @Then("when user click create button")
    public void when_user_click_create_button() {

        MisranWebElementPage misranWebElementPage = new MisranWebElementPage();
        BrowserUtils.highlightElement(BrowserUtils.waitForClickablility(misranWebElementPage.create, 10)).click();

    }

    @Then("the order page should display")
    public void the_order_page_should_display() {

        MisranWebElementPage misranWebElementPage = new MisranWebElementPage();
        Assert.assertTrue(BrowserUtils.waitForVisibility(misranWebElementPage.confirm_order, 10).isDisplayed());

    }
}
