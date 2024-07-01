package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Locators;
import utils.SeleniumActions;
import utils.SeleniumBase;

import static utils.SeleniumActions.Waits.ELEMENT_TO_BE_CLICKABLE;

public class HomePage extends SeleniumBase {
    SeleniumActions actions = new SeleniumActions();
    Locators locators = new Locators();

    public void hitAllCustomersPage(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.shadowHost));
        WebElement shadowHost = driver.findElement(locators.shadowHost);
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        System.out.println(shadowRoot);
        shadowRoot.findElement(locators.peopleSubMenLink).click();





    }
}
