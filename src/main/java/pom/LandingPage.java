package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import utils.Locators;
import utils.SeleniumActions;
import utils.SeleniumBase;
import static utils.SeleniumActions.Waits.ELEMENT_TO_BE_CLICKABLE;

public class LandingPage extends SeleniumBase {

    SeleniumActions actions = new SeleniumActions();
    Locators locators = new Locators();

    public void loginToHomePage(String email, String password){
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,locators.emailField);
        actions.sendKeys(locators.emailField,email);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,locators.passwordFiled);
        actions.sendKeys(locators.passwordFiled,password);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,locators.loginBtn);
        actions.click(locators.loginBtn);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,locators.demoStoreBtn);
        actions.click(locators.demoStoreBtn);
        actions.waitUntil(ELEMENT_TO_BE_CLICKABLE,locators.continueBtn);
        actions.click(locators.continueBtn);
    }


}
