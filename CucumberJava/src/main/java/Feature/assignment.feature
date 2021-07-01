@MyAssignments
Feature: feature to test Udemy portal

  @Assignment-1
  Scenario: Verify logging in udemy
    Given Open flipkart page in chrome driver
    When Log in using dummy username and password
    Then Verify u r navigated to home page after logging in

  @Assignment-2
  Scenario: Verify Selenium WebDriver with Java -Basics to Advanced+Frameworks is successfully added in cart
    Given Open flipkart page in chrome driver
    When Log in using dummy username and password
    And Type the product name in search bar and select the product from search result
    And Select the first item from the result set
    And Click on Add to cart
    And Go to cart
    Then Verify the product is added in the cart page
