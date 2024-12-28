@PurchaseProduct
Feature:  purchase Products as user
  Scenario: Verify that Products Are Purchased Successfully
    Given The user is on the homepage
    When user Click on Laptops under categories on the homepage
    And Choose Product 1
    And Click on the Add to Cart button1
    Then Product 1 is added to the cart with confirmation
    And back to homepage
    And user Click on Laptops
    And Choose Product 2
    And Click on the Add to Cart button
    Then Product 2 is added to the cart with confirmation
#    And Validate that Products has been successfully added to the cart
    When click on cart button
    And Verify that products are displayed in the cart title
    And Verify that products are displayed in the cart price
    Then products are visible in the cart, with their respective titles
    Then products are visible in the cart, with their respective prices
#    Then Product 1 is added to the cart with confirmation
    When Click on the Place order button
    And  Verify that the total amount is calculated correctly on the placeholder page
    And  Fill in Name
    And  Country
    And City
    And Credit Card Number
    And Month
    And Year
    And  Click on the Purchase button
    Then A success message should be displayed:Thank you for your purchase!
