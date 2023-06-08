Feature: user able
  Background:
    Given user is on login page
    When user enters valid username
    And user enters valid password
    Then user logs in successfully and Dashboard page is displayed

    Scenario: User select item and placed order successfully.
      Given user select item "Sauce Labs Fleece Jacket" and add it to cart
      When user select item "Sauce Labs Bolt T-Shirt" and add it to cart
      And verify add to cart button is toggled to remove button for "Sauce Labs Fleece Jacket"
      And verify add to cart button is toggled to remove button for "Sauce Labs Bolt T-Shirt"
      Then verify user successfully added "Sauce Labs Fleece Jacket,Sauce Labs Bolt T-Shirt" items in the cart
      Then user is navigated to cart and checkout
      Then user navigated to address details page and enters address
      Then verify user navigated to order preview page
      Then verify details on order preview page
      Then user clicks on finish button and navigated to order completion page
      And verify order is placed successfully
      And user logs off successfully

  Scenario: verify products are sorted as per low to high price selection
    Given user clicks on filter dropdown
    And select option "low to high"
    Then verify that products are sorted as per selection

  Scenario: verify products are sorted as per A to Z name selection
    Given user clicks on filter dropdown
    And select option "A to Z"
    Then verify that products are sorted as per selection

    Scenario: verify and navigate to saucelabs
      Given user click on menu sidebar
      And user click on About
      Then user navigate to saucelabs page

