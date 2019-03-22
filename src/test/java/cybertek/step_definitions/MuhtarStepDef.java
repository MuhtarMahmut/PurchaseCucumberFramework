package cybertek.step_definitions;

import cucumber.api.java.en.*;
import cybertek.pages.everyone_pages.MuhtarWebElementPage;
import cybertek.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MuhtarStepDef {

    MuhtarWebElementPage ME= new MuhtarWebElementPage();

    public WebDriverWait wait=new WebDriverWait(Driver.getDriver(),100);

    @When("click the purchaseOrder")
    public void click_the_purchaseOrder() {
        ME.purchaseOrder.click();
        wait.until(ExpectedConditions.titleContains("Purchase Orders"));
    }

    @When("Click The Create Button")
    public void click_The_Create_Button() {
        ME.CreateButton.click();
    }

    @Then("Click the Add an Item")
    public void click_the_Add_an_Item() {
        ME.AddanItem.click();
    }

    @Then("should be able to select item from Product Drop Down Box")
    public void should_be_able_to_select_item_from_Product_Drop_Down_Box() {
        ME.ProductDropDownBox.click();
        new Actions(Driver.getDriver()).moveToElement(ME.RandomElementInProduct).click().perform();
    }

    @Then("The default teax should be {int}")
    public void the_default_teax_should_be(Integer int1) {
        Assert.assertTrue(new Double(ME.TaxesAmount.getText()) == 0);
    }

    @Then("Qunatity box should be empty.")
    public void qunatity_box_should_be_empty() {

        Assert.assertTrue(ME.QuantityBox.getText().isEmpty());
    }

    @Then("Received Quantity should be equal to {int}.")
    public void received_Quantity_should_be_equal_to(Integer int1) {
        Assert.assertTrue(new Double(ME.RecievedQuantity.getText()) == 0);
    }

    @Then("Billed Quantity should be equal to {int}.")
    public void billed_Quantity_should_be_equal_to(Integer int1) {
        Assert.assertTrue(new Double(ME.BilledQuantity.getText()) == 0);
    }

    @Then("Eneter {string} to Unit Price box")
    public void eneter_to_Unit_Price_box(String string) {
        ME.UnitPrice.sendKeys(Keys.CONTROL + "A" + Keys.BACK_SPACE);
        ME.UnitPrice.sendKeys(string);
        wait.until(ExpectedConditions.textToBePresentInElement(ME.Total, "200.00"));
    }


}