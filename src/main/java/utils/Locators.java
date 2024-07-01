package utils;

import org.openqa.selenium.By;


public class Locators {
    public By emailField = By.cssSelector("input[id='email']");
    public By passwordFiled = By.cssSelector("input[id='password']");
    public By loginBtn = By.cssSelector("button[type='submit']");
    public By demoStoreBtn = By.xpath("//label[@for='store-2184']");
    public By continueBtn = By.xpath("//button[text()='Continue']");
    public By shadowHost = By.cssSelector("convertedin-sidebar");
    public By peopleSubMenLink = By.cssSelector(".p-accordion .p-element .p-accordion-header-link");


}
