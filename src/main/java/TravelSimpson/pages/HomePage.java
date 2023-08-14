package TravelSimpson.pages;

import TravelSimpson.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement cookie;


    @CacheLookup
    @FindBy(css = "body > div:nth-child(6) > div:nth-child(3) > div:nth-child(4) > a:nth-child(1) > span:nth-child(1)")
    WebElement holidayInspiration;

    @CacheLookup
    @FindBy(css = "body > div:nth-child(6) > div:nth-child(3) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")
    WebElement simpsonSecrets;



//*********************************

    public void acceptCookieButton() {
        Reporter.log("Accept Cookie" + cookie.toString() + "<br>");
        clickOnElement(cookie);
    }

    public void selectMenu(String menu) {
        Reporter.log("Mousehover on Menu bar" + holidayInspiration.toString() + "<br>");
        mouseHoverToElement(holidayInspiration);
    }

    public void selectMenuItem(String menuItem) throws InterruptedException {
        Reporter.log("Select Item from Menu bar" + simpsonSecrets.toString() + "<br>");
        Thread.sleep(2000);
        mouseHoverToElementAndClick(simpsonSecrets);
    }

}