package cybertek.step_definitions;

import cucumber.api.java.en.*;
import cybertek.pages.everyone_pages.ZohraWebElementPage;
import cybertek.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class ZohraStepDef {

    ZohraWebElementPage ZE=new ZohraWebElementPage();
    public List<WebElement> allcheckboxes;
    public WebDriverWait wait=new WebDriverWait(Driver.getDriver(),100);

    @When("click the Reference check box")
    public void click_the_Reference_check_box() {
        ZE.ReferenceCheckbox.click();
    }

    @Then("All check boxes will be selected")
    public void all_check_boxes_will_be_selected() {
        String xpath1="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[1]/div[1]/input[1]";
         allcheckboxes= Driver.getDriver().findElements(By.xpath(xpath1));
        for (WebElement p : allcheckboxes)
            Assert.assertTrue(p.isSelected());

    }

    @When("click the Reference check box again")
    public void click_the_Reference_check_box_again() {
        ZE.ReferenceCheckbox.click();
    }

    @Then("All check boxes will be deselected.")
    public void all_check_boxes_will_be_deselected() {
        String xpath1 = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr/td[1]/div[1]/input[1]";
        allcheckboxes = Driver.getDriver().findElements(By.xpath(xpath1));
        for (WebElement p : allcheckboxes)
            Assert.assertFalse(p.isSelected());

    }

    @When("click the each products check box.")
    public void click_the_each_products_check_box() {
        String AA="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr";
         allcheckboxes=Driver.getDriver().findElements(By.xpath(AA+"/td[1]/div[1]/input[1]"));
         for(WebElement p : allcheckboxes){
            sleep(0.2);
                    p.click();
            Assert.assertTrue(p.isSelected());
         }

    }

    @Then("each products check box will be selected.")
    public void each_products_check_box_will_be_selected() {
        String AA="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr";
        List<WebElement> allcheckboxes=Driver.getDriver().findElements(By.xpath(AA+"/td[1]/div[1]/input[1]"));
        for(WebElement p : allcheckboxes){
            Assert.assertTrue(p.isSelected());
        }
    }

    @Then("sum of all untexted amount equal to the total balance shown at the end.")
    public void sum_of_all_untexted_amount_equal_to_the_total_balance_shown_at_the_end() {
        String tota="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr";
        List<WebElement> untaxted=Driver.getDriver().findElements(By.xpath(tota+"/td[7]"));
        String b=ZE.totalUntaxtedAmount.getText().replace(",","");
        double B=new Double(b);
        double total=0;
        for(int i=0; i<untaxted.size();i++) {
            String a=untaxted.get(i).getText().replace("$ ", "").replace(",","");
            double A=new Double(a);
            total+=A;
        }
        Assert.assertTrue(total==B);

    }

    @Then("each vendor's name on table matches with thier name on recipe.")
    public void each_vendor_s_name_on_table_matches_with_thier_name_on_recipe() {
        String x = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[";
        for (int i = 1; i < 10; i++) {
            WebElement VendorNameOnTable = Driver.getDriver().findElement(By.xpath(x + i + "]/td[4]"));
            String ExpectedName = VendorNameOnTable.getText();
            VendorNameOnTable.click();
            WebElement VendorNameOnRecipe = Driver.getDriver().findElement(By.xpath("//a[@name='partner_id']"));
            Assert.assertTrue(ExpectedName.contains(VendorNameOnRecipe.getText()));
            ZE.purchaseMoudle.click();
            wait.until(ExpectedConditions.visibilityOf(ZE.CreateButton));
        }
    }


    public static void sleep(double a){
        try {
            Thread.sleep((int) (a * 1000));
        } catch (Exception e){
        }
    }
}
