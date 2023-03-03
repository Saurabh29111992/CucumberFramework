

@Email
Feature: Title of your feature
  I want to use this template for my feature file

  @EmailLogin @Sanity @Smoke
  Scenario: Admin area demo Email Login
    Given User Launch Chrome Browser
    When User Open URL "https://admin-demo.nopcommerce.com/login"
    And User enter Email as "admin@yourstore.com" and enter Password "admin"
    And Click on Login button
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User Clicks on Logout button
    Then Page Title should be "Your store. Login"
    And Close the browser

 