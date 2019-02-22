package cybertek.pages.everyone_pages.sample;

import cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {

    public ProductListPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='result_1']//h2[contains(@class,'a-text-normal')][contains(text(),'PlayStation 4 Slim 1TB Console')]")
    public WebElement firstOption;
}
