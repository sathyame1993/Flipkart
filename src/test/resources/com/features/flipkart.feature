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
    