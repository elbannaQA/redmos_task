import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.LandingPage;
import utils.Locators;
import utils.SeleniumActions;
import utils.SeleniumBase;


public class Tests{
    LandingPage landingPage = new LandingPage();
    HomePage homePage = new HomePage();

    @BeforeTest
    public void init() {
        SeleniumBase seleniumBase = new SeleniumBase();
        seleniumBase.seleniumConfig();
        seleniumBase.environmentSetup();
    }

    @Test
    public void HitSideMenuBar() throws InterruptedException {
        landingPage.loginToHomePage("shanelzstore@gmail.com","pzq6TGHF7t");
        homePage.hitAllCustomersPage();
    }

}