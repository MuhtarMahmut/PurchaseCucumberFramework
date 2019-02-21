package cybertek.pages.everyone_pages;

import cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MisranWebElementPage {

    public MisranWebElementPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[contains(text(),'Requests for Quotation')]")
    public WebElement Requests_for_Quotation;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement create;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default'][contains(text(),'Confirm Order')]")
    public WebElement confirm_order;

    @FindBy(xpath = "//li[@class='active']//a[@class='oe_menu_leaf']")
    public WebElement products;

    @FindBy(xpath = "//li[contains(text(),'products')]")
    public WebElement productsText;
}
