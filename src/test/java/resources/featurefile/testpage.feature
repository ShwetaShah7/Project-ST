Feature: Booking a Holiday

  Scenario: User should be able to navigate through the website and make booking successfully
    Given User is on HomePage
    When User clicks on Accept button for Cookies
    And User selects Top Menu Bar "Holiday Inspiration"
    And User clicks on Tab Menu Item "Simpson Secrets"
    And User verify the page by Header Title "Simpson Secrets"
    And User scrolls down the page
    And User clicks on Simpson Secret – Corfu
    And User verify the Corfu page by Header Title "Simpson Secret – Corfu"
    And User scrolls down the page for booking
    And User selects the date for booking
#    And User selects "Bristol" from the dropdown for departure Airport
#    And User clicks on Book Now button
#    And Verify that User is on the Step 1 section by Title "Flight details"
#    And User clicks on the Next button on Step 1 section
#    And Verify that User is on the Step 2 section by Title "Options & extras"
#    And User selects radio option "Corfu Group D - Peugeot 301 a/c or similar"
#    And User clicks on the Next Button on Step 2 section
#    And Verify that User is on the Step 3 section by Title "Passenger details"





