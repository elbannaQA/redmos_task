package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import utils.Locators;
import utils.SeleniumActions;
import utils.SeleniumBase;

import static utils.SeleniumActions.Waits.ELEMENT_TO_BE_CLICKABLE;

public class HomePage extends SeleniumBase {
    SeleniumActions actions = new SeleniumActions();
    Locators locators = new Locators();

    public void hitAllCustomersPage() throws InterruptedException {

        Thread.sleep(10000);
        WebElement shadowHost = driver.findElement(By.cssSelector("convertedin-sidebar"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        System.out.println(shadowRoot);
        shadowRoot.findElement(By.cssSelector(".p-accordion .p-element .p-accordion-header-link")).click();



    }
}
