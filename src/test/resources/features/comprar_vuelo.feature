Feature: I as user of the Wingo
  i want to buy a flight
  to buy

  Scenario: Successfull find
    Given user in the home page
    When user find a flight filling all fields
    Then user sees the flight
