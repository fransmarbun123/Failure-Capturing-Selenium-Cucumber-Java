Feature: Free Automation Practice Test

Background: User navigates to Application URL
    Given I am on the Login page URL "http://automationpractice.com/index.php"
    Then I should see Log In Page

  Scenario: Sign In with valid credential
    When I enter username as "admin"
    And I enter password as "password"
    And click on login button