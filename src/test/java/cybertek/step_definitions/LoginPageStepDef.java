package cybertek.step_definitions;

import cucumber.api.java.en.Given;
import cybertek.pages.commom_page.LoginPage;
import cybertek.pages.commom_page.MainPage;
import cybertek.pages.commom_page.PurchasePage;
import cybertek.utilities.BrowserUtils;
import cybertek.utilities.ConfigurationReader;
import cybertek.utilities.Driver;
import cybertek.utilities.ExcelUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageStepDef {

    private WebDriver driver = Driver.getDriver();
    private static int timer = 10;
    private static double sleepTimer = 7;
    public WebDriverWait wait = new WebDriverWait(driver, 100);


    @Given("user login as a manager")
    public void user_login_as_a_manager() {

        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        PurchasePage purchasePage = new PurchasePage();
        ExcelUtil manager = new ExcelUtil("MOCK_DATA.xlsx", "manager");

        driver.get(ConfigurationReader.getProperty("url"));
        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(mainPage.BriteErpDemo, timer)).click();
        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.email, timer)).sendKeys(manager.getDataList().get(0).get("Manager UserName"));
        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.password, timer)).sendKeys(manager.getDataList().get(0).get("Manager Password"));
        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(loginPage.loginBtn, timer)).click();
        wait.until(ExpectedConditions.titleContains("Inbox"));
        BrowserUtils.highlightElement(BrowserUtils.waitForVisibility(purchasePage.purchases, timer)).click();
        wait.until(ExpectedConditions.titleContains("Requests "));

    }
}
