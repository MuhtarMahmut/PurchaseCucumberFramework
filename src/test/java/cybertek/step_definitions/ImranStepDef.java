package cybertek.step_definitions;

import cucumber.api.java.en.Then;
import cybertek.pages.everyone_pages.ImranWebElementPage;
import cybertek.pages.everyone_pages.MuhtarWebElementPage;
import cybertek.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImranStepDef {


    ImranWebElementPage IE=new ImranWebElementPage();

    public WebDriverWait wait=new WebDriverWait(Driver.getDriver(),100);

    @Then("the hearder text should match with the title.")
    public void the_hearder_text_should_match_with_the_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(IE.headerText.getText()));
    }



}
