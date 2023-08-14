package TravelSimpson.pages;

import TravelSimpson.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.time.Duration;


public class SimpsonSecretPage extends Utility {

    private static final Logger log = LogManager.getLogger(SimpsonSecretPage.class.getName());

    public SimpsonSecretPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[@class='l-content__title align-center']")
    WebElement verifySecretsPage;

    @CacheLookup
    @FindBy (xpath = "//h3[contains(text(),'Simpson Secret – Corfu')]")
    WebElement simpsonSecretCorfu;


//    ***********************

    public String verifySimpsonSecretsPage() {
        Reporter.log("Verify Simpson Secrets Page" + verifySecretsPage.toString() + "<br>");
        return getTextFromElement(verifySecretsPage);
    }

    public void slider() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        jse.executeScript("window.scrollBy(0,1000)");
    }

    public void clickOnSimpsonSecretCorfu() {
        Reporter.log("Click on Simpson Secret - Corfu" + simpsonSecretCorfu.toString() + "<br>");
        simpsonSecretCorfu.click();
    }
}