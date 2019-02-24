package cybertek.step_definitions;

import cucumber.api.java.en.Then;
import cybertek.pages.everyone_pages.ReyisaWebElementPage;
import cybertek.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RayisaStepDef {

ReyisaWebElementPage RE=new ReyisaWebElementPage();
    public WebDriverWait wait=new WebDriverWait(Driver.getDriver(),100);

    @Then("title should contain {string}")
    public void title_should_contain(String string) {
        wait.until(ExpectedConditions.titleContains(string));
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @Then("Header’s of Quotation page equals link's title")
    public void header_s_of_Quotation_page_equals_link_s_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(RE.headerText.getText()));
    }

    @Then("The title of the page should contain {string}")
    public void the_title_of_the_page_should_contain(String string) {
        RE.purchaseOrder.click();
        wait.until(ExpectedConditions.titleContains("Purchase Orders"));
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Purchase Orders"));
    }




    @Then("Total tax should equal to Subtotal * Tax rate;")
    public void total_tax_should_equal_to_Subtotal_Tax_rate() {
        double taxrate = 0, subtotal = 0, TotalTax = 0;
        if (!RE.TaxesDropDownBox.getText().isEmpty())
            taxrate = new Double(RE.TaxesDropDownBox.getText());
        if (!RE.Subtotal.getText().isEmpty())
            subtotal = new Double(RE.Subtotal.getText());
        if (!RE.TaxesAmount.getText().isEmpty())
            TotalTax = new Double(RE.TaxesAmount.getText());
        Assert.assertTrue(TotalTax == (subtotal * taxrate));
    }

    @Then("Total Price = subtotal + Taxes amount")
    public void total_Price_subtotal_Taxes_amount() {
        double Totalprice=new Double(RE.Total.getText()),
                SubtotalPrice=new Double(RE.Subtotal.getText()),
                TaxesAmount=new Double(RE.TaxesAmount.getText());
        Assert.assertTrue(Totalprice == (SubtotalPrice + TaxesAmount));
    }


}
