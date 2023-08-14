package TravelSimpson.pages;

import TravelSimpson.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class BookingAndPaymentPage extends Utility {

    private static final Logger log = LogManager.getLogger(BookingAndPaymentPage.class.getName());

    public BookingAndPaymentPage() {
        PageFactory.initElements(driver, this);
    }

  @CacheLookup
    @FindBy (xpath = "//p[contains(text(),'Flight details')]")
    WebElement flightDetails;



//    ***************

    public String verifyFlightDetailsSection(){
        Reporter.log("Verify Step 1: Flight Details" + flightDetails.toString() + "<br>");
        return getTextFromElement(flightDetails);
    }





}