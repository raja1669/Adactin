Feature: Verify the user able to book the hotel in adactin application

  Scenario: To verify user able to login the adactin application
    Given User should launch the application
    When Enter the valid user name
    And Enter the valid password
    And Click the login button
    Then Verify Homepage navigates to the search hotel page

   Scenario: Search the hotels in search hotel page
    Given Search hotels page is displayed
    When select the location by drop down
    When select the hotel by drop down
    When select the room type by drop down
    And  Select the no of rooms
    And Enter the check in date
    And Enter the check out date
    And Select the Adult per room
    And Select the children per room
    Then click on the search button

  Scenario: Select the hotel
    Given User should complete the search hotel page
    When select the hotel by radio button
    Then click on continue

  Scenario: Verify user able to Book a Hotel
    Given User should complete the select hotel page
    When Enter the First name
    When Enter the last name
    And Enter the Billing address
    And Enter the Credit card no
    And Select the Credit card Type
    And Select the Expiery date
    And Select the Year
    And Enter the CVV no
    Then Click on the Book now button

  Scenario: Verify the booking confirmation
    Given User Should complete the Booking a Hotel page
    When Verify the booking is confirmed
    Then click on search itinerary

  Scenario: Verify user able to logout successful
    Given User launches the application
    When Verify the Order Id confirmation
    Then Click on the Logout
   