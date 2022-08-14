@tag
Feature: Validate Grade

  @tag1
  Scenario: user succesfully edit button in grade name
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button
    And user click on master module
    And user Hover the right slidebar
    And user Click on employee from Slider
    And user click on grade
    And user click on add Button
    And user click on edit button
    Then user Quit from the site
