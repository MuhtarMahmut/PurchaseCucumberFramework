package cybertek.pages.everyone_pages;

import cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImranWebElementPage {
    public ImranWebElementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public @FindBy(xpath="//ol[@class='breadcrumb']")
    WebElement headerText;



}
