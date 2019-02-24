package cybertek.step_definitions;

import cucumber.api.java.en.*;
import cybertek.pages.everyone_pages.IhtibarWebElementPage;
import cybertek.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class IhtiparStepDef {

    IhtibarWebElementPage IE=new IhtibarWebElementPage();
    public WebDriverWait wait=new WebDriverWait(Driver.getDriver(),100);

    @When("Click Vendor Bill link.")
    public void click_Vendor_Bill_link() {
        IE.VendorBillsPage.click();
        wait.until(ExpectedConditions.titleContains("Vendor Bil"));
    }

    @Then("Page title should contain {string}")
    public void page_title_should_contain(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @When("Click the Products link")
    public void click_the_Products_link() {
        IE.ProductsPage.click();
        wait.until(ExpectedConditions.titleContains("Produc"));

    }

    @Then("the page title should contain {string}")
    public void the_page_title_should_contain(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Produc"));
    }


    @When("Click the Incoming Products")
    public void click_the_Incoming_Products() {
        IE.IncomingProducts.click();
        wait.until(ExpectedConditions.titleContains("Incoming Pro"));
    }

    @Then("Select the Random product")
    public void select_the_Random_product() {
        IE.randomelement.click();
    }

    @Then("Click the action button.")
    public void click_the_action_button() {
        IE.ActionButton.click();
    }

    @Then("Select the delete")
    public void select_the_delete() {
        IE.DeleteFromActionButton.click();
    }

    @Then("confirmation window will pup up")
    public void confirmation_window_will_pup_up() {
        Assert.assertTrue(IE.confirmTheDelete.isDisplayed());
    }

    @Then("click the expected date check box")
    public void click_the_expected_date_check_box() {
            IE.ExpectedDateCheckBox.click();
    }

    @Then("all check boxes will be selected.")
    public void all_check_boxes_will_be_selected() {
        List<WebElement> all = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[1]//div[1]//input[1]"));
        for(WebElement p: all){
            Assert.assertTrue(p.isSelected());
        }
    }



}
