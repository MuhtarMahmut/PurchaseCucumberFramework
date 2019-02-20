package cybertek.step_definitions;

import cucumber.api.java.en.Given;
import cybertek.pages.LoginPage;
import cybertek.utilities.BrowserUtils;
import cybertek.utilities.ConfigurationReader;
import cybertek.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginPageStepDef {

    private static WebDriver driver = Driver.getDriver();

    @Given("user login as a manager using {string} and {string}")
    public void user_login_as_a_manager_using_and(String userName, String password) {

        LoginPage loginPage = new LoginPage();

        driver.get(ConfigurationReader.getProperty("url"));

        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.BriteErpDemo, 10)).click();

        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.email, 10)).sendKeys(userName);

        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.password, 10)).sendKeys(password);

        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.loginBtn, 10)).click();

        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.purchases, 10)).click();

        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.purchases, 10)).click();

        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.purchases, 10)).click();

        String expectedTitle = "Requests for Quotation - Odoo";

        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }
}
