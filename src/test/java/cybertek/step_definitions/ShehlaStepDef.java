package cybertek.step_definitions;

import cucumber.api.java.en.Then;
import cybertek.pages.everyone_pages.ShehlaWebElementPage;
import cybertek.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShehlaStepDef {

    ShehlaWebElementPage SE=new ShehlaWebElementPage();

    @Then("click the save buttons")
    public void click_the_save_buttons() {
        SE.SaveButton.click();
    }

    @Then("the error message will be displayed.")
    public void the_error_message_will_be_displayed() {
        Assert.assertTrue(SE.VendorErrorMessage.getText().contains("The following fields are invalid"));
    }

    @Then("new subtotal should be dispayed")
    public void new_subtotal_should_be_dispayed() {
        Assert.assertTrue(SE.Subtotal.isDisplayed());
    }

    @Then("the Unit Price Box should be Empty")
    public void the_Unit_Price_Box_should_be_Empty() {
        Assert.assertTrue(SE.UnitPrice.getText().isEmpty());
    }

    @Then("Delete The item")
    public void delete_The_item() {
       SE.DeleteTheAddedItem.click();
    }

    @Then("Click The Vendor drop down box and select random vendor")
    public void click_The_Vendor_drop_down_box_and_select_random_vendor() {
        List<WebElement> myele = Driver.getDriver().findElements(By.xpath(".//*[@class='o_input ui-autocomplete-input' and @autocomplete='off']"));
        myele.get(0).click();
        SE.RandomElementInVendor.click();
    }

}
