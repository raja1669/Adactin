Feature: Verify the user able to book the hotel in adactin application

  Scenario Outline: To verify user able to login the adactin application
    Given User should launch the application
    When Enter the valid "<username>" user name
    And Enter the valid "<password>" password
    And Click the login button
    Then Verify Homepage navigates to the search hotel page

    Examples: 
      | username | password   |
      | AAA      |        123 |
      | test     | @r785478   |
      | raja1669 | @RAVIGIRI@ |

  Scenario: Search the hotels in search hotel page
    When select the location "Brisbane" as "value" by drop down
    When select the hotel "Hotel Sunshine" as "value" by drop down
    When select the room type "Deluxe" as "value" by drop down
    And Select the no of rooms "4" as "value" by drop down
    And Enter the check in date "02/12/2020" as "value"
    And Enter the check out date "010/12/2020" as "value"
    And Select the Adult per room "3" as "value"
    And Select the children per room
    Then click on the search button

  Scenario: Select the hotel
    When select the hotel by radio button
    Then click on continue

  @RegressionTest
  Scenario: Verify user able to Book a Hotel
    When Enter the First name as "Raja"
    When Enter the last name  as "Ravi"
    And Enter the Billing address as "32/32 sasthri 1 st cross street"
    And Enter the Credit card no as "12345678978945612"
    And Select the Credit card Type "VISA"
    And Select the Expiery date as "April"
    And Select the Year as "2020"
    And Enter the CVV no "125"
    Then Click on the Book now button

  Scenario: Verify the booking confirmation
    When Verify the booking is confirmed
    Then click on search itinerary

  Scenario: Verify user able to logout successful
    When Verify the Order Id confirmation
    Then Click on the Logout
