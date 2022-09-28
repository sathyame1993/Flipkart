Feature: Automate the Flipkart application for the following scenarios
Scenario: Launch the URL & Do a Product search
    Given user enter into the flipkart Homepage
    When user clicks the mobile category
    And clicks the realme mobile from electronics menu
    Then user is navigated to list of realme mobile page 
    
 Scenario: Select any product & Add that to the cart
     When user clicks the first mobile from the list
     And user should get the same product to be displayed that he clicked
     Then user add that product to the cart
    
 Scenario: Place Order & Login to the application
     Given user clicks the place order button
     And user enters the mobile no and clicks the continue button
     Then user enters the password and login to application
 
 Scenario: Select Address & Select Payment option
     Given user selects the address 
     Then clicks the continue to payment button
     And clicks the accept and continue button of popup
     Then selects the card payment option
     