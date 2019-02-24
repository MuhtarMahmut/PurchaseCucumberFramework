package cybertek.pages.everyone_pages;

import cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IhtibarWebElementPage {
    public IhtibarWebElementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public  @FindBy(xpath="//button[contains(text(),'Action')]")
    WebElement ActionButton;

    public @FindBy(linkText="Incoming Products")
    WebElement IncomingProducts;

    public @FindBy(linkText="Delete")
    WebElement DeleteFromActionButton;

    public @FindBy(xpath="//div[@class='modal-body']")
    WebElement confirmTheDelete;

    public @FindBy(xpath = "//tbody//tr[2]//td[1]//div[1]//input[1]")
    WebElement randomelement;

    public  @FindBy(xpath = "//th[@class='o_list_record_selector']//input[@type='checkbox']")
    WebElement ExpectedDateCheckBox;

    public @FindBy(xpath = "//span[@name='product_uom_qty']")
    WebElement QuantityOnRecipe;

    public @FindBy(xpath="//span[contains(text(),'Vendor Bills')]")
    WebElement VendorBillsPage;

    public @FindBy(xpath="//div[@class='o_sub_menu_content']//div[9]//ul[1]//li[4]//a[1]//span[1]")
    WebElement ProductsPage;

}
