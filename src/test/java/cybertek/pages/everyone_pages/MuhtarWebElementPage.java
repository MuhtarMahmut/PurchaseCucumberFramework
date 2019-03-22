package cybertek.pages.everyone_pages;

import cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MuhtarWebElementPage {
    public MuhtarWebElementPage(){  PageFactory.initElements(Driver.getDriver(),this);  }

    public @FindBy(xpath = "//span[contains(text(),'Purchase Orders')]")
    WebElement purchaseOrder;

    public @FindBy(xpath = "//button[contains(text(),'Create')]")
    WebElement CreateButton;

    public @FindBy(xpath = "//div[@class='o_form_buttons_edit']//button[@type='button'][contains(text(),'Save')]")
    WebElement SaveButton;

    public @FindBy(linkText = "Add an item")
    WebElement AddanItem;

    public @FindBy(xpath = "//div[@name='product_id']//input[@type='text']")
    WebElement ProductDropDownBox;

    public @FindBy(xpath = "//span[@name='amount_tax']")
    WebElement TaxesAmount;

    public @FindBy(partialLinkText = "Ice")
    WebElement RandomElementInProduct;

    public @FindBy(xpath="//input[@name='product_qty']")
    WebElement QuantityBox;

    public @FindBy(xpath="//span[@name='qty_received']")
    WebElement RecievedQuantity;

    public @FindBy(xpath="//span[@name='qty_invoiced']")
    WebElement BilledQuantity;

    public @FindBy(xpath = "//input[@name='price_unit']")
    WebElement UnitPrice;

    public @FindBy(xpath="//div[@name='taxes_id']//input[@type='text']")
    WebElement TaxesDropDownBox;

    public @FindBy(xpath = "//span[@name='price_subtotal']")
    WebElement Subtotal;

    public @FindBy(xpath = "//span[@name='amount_total']")
    WebElement Total;






}
