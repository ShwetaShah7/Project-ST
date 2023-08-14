package TravelSimpson.steps;

import TravelSimpson.pages.HomePage;
import TravelSimpson.pages.SimpsonSecretCorfuPage;
import TravelSimpson.pages.SimpsonSecretPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TestStepdefs {
    @Given("^User is on HomePage$")
    public void userIsOnHomePage() {
    }

    @When("^User clicks on Accept button for Cookies$")
    public void userClicksOnAcceptButtonForCookies() {
        new HomePage().acceptCookieButton();
    }

    @And("^User selects Top Menu Bar \"([^\"]*)\"$")
    public void userSelectsTopMenuBar(String menu) {
        new HomePage().selectMenu(menu);
    }

    @And("^User clicks on Tab Menu Item \"([^\"]*)\"$")
    public void userClicksOnTabMenuItem(String menuItem) throws InterruptedException {
        new HomePage().selectMenuItem(menuItem);
    }


    @And("^User verify the page by Header Title \"([^\"]*)\"$")
    public void userVerifyThePageByHeaderTitle(String expected) {
        Assert.assertEquals(expected, new SimpsonSecretPage().verifySimpsonSecretsPage());
    }

    @And("^User scrolls down the page$")
    public void userScrollsDownThePage() {
        new SimpsonSecretPage().slider();

    }

    @And("^User clicks on Simpson Secret – Corfu$")
    public void userClicksOnSimpsonSecretCorfu() {
        new SimpsonSecretPage().clickOnSimpsonSecretCorfu();
    }


    @And("^User verify the Corfu page by Header Title \"([^\"]*)\"$")
    public void userVerifyTheCorfuPageByHeaderTitle(String expected)  {
        Assert.assertEquals(expected,new SimpsonSecretCorfuPage().verifyCorfuPageByTitle());
    }

    @And("^User scrolls down the page for booking$")
    public void userScrollsDownThePageForBooking() {
        new SimpsonSecretCorfuPage().slider();
    }

    @And("^User selects the date for booking$")
    public void userSelectsTheDateForBooking() {
        new SimpsonSecretCorfuPage().selectDate();
    }


//    @And("^User selects \"([^\"]*)\" from the dropdown for departure Airport$")
//    public void userSelectsFromTheDropdownForDepartureAirport(String airport)  {
//       new SimpsonSecretCorfuPage().selectAirport(airport);
//    }
//
//    @And("^User clicks on Book Now button$")
//    public void userClicksOnBookNowButton() {
//        new SimpsonSecretCorfuPage().clickOnBookNowButton();
//    }


}
