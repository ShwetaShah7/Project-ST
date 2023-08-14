package TravelSimpson.pages;

import TravelSimpson.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.time.Duration;
import java.util.List;


public class SimpsonSecretCorfuPage extends Utility {

    private static final Logger log = LogManager.getLogger(SimpsonSecretCorfuPage.class.getName());

    public SimpsonSecretCorfuPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Simpson Secret – Corfu')]")
    WebElement verifyCorfuPage;

//    @CacheLookup
//    @FindBy (xpath = "//select[@id='booking-departure-airport']")
//    WebElement departureAirport;
//
//    @CacheLookup
//    @FindBy (xpath = "//button[@name='submitButton']")
//    WebElement bookNowButton;



//    **********


    public void slider() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        jse.executeScript("window.scrollBy(0,900)");
    }

    public String verifyCorfuPageByTitle() {
        Reporter.log("Verify Simpson Secret Corfu Page by Header Title" + verifyCorfuPage.toString() + "<br>");
        return getTextFromElement(verifyCorfuPage);
    }

    public void selectDate() {

        String year = "2024";
        String month = "August";
        String date = "7";

        while (true) {
            String monthYear = driver.findElement(By.xpath("//section[@class='m-toggle-block m-toggle-block--tight js-toggle-block-done']//h3")).getText(); // August 2024
            String arr[] = monthYear.split(" ");
            String mon = arr[0];
            String year1 = arr[1];

            System.out.println(mon);
            System.out.println(year1);

            if (mon.equalsIgnoreCase(month) && year1.equalsIgnoreCase(year)) {
                break;
            } else {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                clickOnElement(By.xpath("//a[@class='m-property__availability__booking-widget__nav__link m-property__availability__booking-widget__nav__link--next active js-booking-cal-next']//i"));
            }
        }

        List<WebElement> listOfDates = driver.findElements(By.xpath("//table[@class='m-property__availability__booking-widget__table']//tbody//tr//td"));
        for (WebElement dt : listOfDates) {
            if (dt.getText().equalsIgnoreCase(date)) {
                dt.click();
                break;
            }
        }

    }

//    public void selectAirport(String airport) {
//        log.info("Select Departure Airport" + departureAirport.toString() + "<br>");
//        selectByVisibleTextFromDropDown(departureAirport, airport);
//    }
//
//    public void clickOnBookNowButton() {
//        Reporter.log("Click on Book Now Button" + bookNowButton.toString() + "<br>");
//        bookNowButton.click();
//    }

}