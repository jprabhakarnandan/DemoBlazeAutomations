Feature: Demoblaze Full Purchase Flow

  Scenario: Login Add To Cart and Purchase

    Given user opens Demoblaze website
    When user logs in
    And user selects a phone
    And user adds product to cart
    And user goes to cart
    And user places the order
    Then order should be placed successfully