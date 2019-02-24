package cybertek.pages.everyone_pages;

import cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReyisaWebElementPage {
    public ReyisaWebElementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public @FindBy(xpath="//div[@name='taxes_id']//input[@type='text']")
    WebElement TaxesDropDownBox;

    public @FindBy(xpath = "//span[@name='price_subtotal']")
    WebElement Subtotal;

    public @FindBy(xpath = "//span[@name='amount_tax']")
    WebElement TaxesAmount;

    public @FindBy(xpath = "//span[@name='amount_total']")
    WebElement Total;

    public @FindBy(xpath="//ol[@class='breadcrumb']")
    WebElement headerText;

    public @FindBy(xpath = "//span[contains(text(),'Purchase Orders')]")
    WebElement purchaseOrder;






}
