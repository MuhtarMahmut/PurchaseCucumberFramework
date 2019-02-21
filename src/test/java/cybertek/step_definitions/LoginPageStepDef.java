package cybertek.step_definitions;

import cucumber.api.java.en.Given;
import cybertek.pages.commom_page.LoginPage;
import cybertek.utilities.BrowserUtils;
import cybertek.utilities.ConfigurationReader;
import cybertek.utilities.Driver;
import cybertek.utilities.ExcelUtil;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginPageStepDef {

    private static WebDriver driver = Driver.getDriver();

    @Given("user login as a manager")
    public void user_login_as_a_manager() {
        LoginPage loginPage = new LoginPage();
        ExcelUtil manager = new ExcelUtil("MOCK_DATA.xlsx", "manager");

        driver.get(ConfigurationReader.getProperty("url"));

        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.BriteErpDemo, 10)).click();

        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.email, 10)).sendKeys(manager.getDataList().get(0).get("Manager UserName"));

        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.password, 10)).sendKeys(manager.getDataList().get(0).get("Manager Password"));

        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.loginBtn, 10)).click();

        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.purchases, 10)).click();

        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.purchases, 10)).click();

        String expectedTitle = "Requests for Quotation - Odoo";

        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }
}
