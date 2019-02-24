package cybertek.pages.everyone_pages;

import cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZohraWebElementPage {
   public ZohraWebElementPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

    public @FindBy(xpath="//th[@class='o_list_record_selector']//input[@type='checkbox']")
    WebElement ReferenceCheckbox;

    public  @FindBy(xpath="//td[@title='Total Untaxed amount']")
    WebElement totalUntaxtedAmount;

    public @FindBy(xpath = "//span[contains(text(),'Purchases')]")
    WebElement purchaseMoudle;

    public @FindBy(xpath = "//button[contains(text(),'Create')]")
    WebElement CreateButton;


}
