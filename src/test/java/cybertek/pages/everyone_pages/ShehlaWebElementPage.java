package cybertek.pages.everyone_pages;

import cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShehlaWebElementPage {
    public ShehlaWebElementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public @FindBy(xpath = "//span[contains(text(),'Purchase Orders')]")
    WebElement purchaseOrder;

    public @FindBy(xpath = "//button[contains(text(),'Create')]")
    WebElement CreateButton;

    public @FindBy(xpath = "//div[@class='o_form_buttons_edit']//button[@type='button'][contains(text(),'Save')]")
    WebElement SaveButton;

    public @FindBy(xpath = ".//*[@class='o_datepicker_input o_input']")
    WebElement OrderDateBox;

    public @FindBy(xpath = "//div[@class='o_notification_title']")
    WebElement VendorErrorMessage;

    public @FindBy(linkText = "Add an item")
    WebElement AddanItem;

    public @FindBy(xpath = "//span[@name='price_subtotal']")
    WebElement Subtotal;

    public @FindBy(xpath = "//div[@name='product_id']//input[@type='text']")
    WebElement ProductDropDownBox;

    public @FindBy(partialLinkText = "Ice")
    WebElement RandomElementInProduct;

    public @FindBy(xpath = "//input[@name='price_unit']")
    WebElement UnitPrice;

    public @FindBy(xpath = "//td[@class='o_list_record_delete']")
    WebElement DeleteTheAddedItem;

    public @FindBy(xpath = "//span[@name='amount_total']")
    WebElement Total;

    public @FindBy(linkText = "234")
    WebElement RandomElementInVendor;

    public @FindBy(xpath = "//span[@name='amount_tax']")
    WebElement TaxesAmount;




}
