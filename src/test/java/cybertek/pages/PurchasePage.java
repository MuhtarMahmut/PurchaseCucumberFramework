package cybertek.pages;

import cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage {
    public PurchasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "Requests for Quotation")
    public WebElement Requests_for_Quotation;
}
