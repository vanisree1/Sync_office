@tag
Feature: Validate Grade

  @tag1
  Scenario: user Validate grade name
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button
    And user click on master module
    And user Hover the right slidebar
    And user Click on employee from Slider
    And user click on employee list
    And user click on check box from the list
    And user click on delete from the list
    And user click on delete option for confirmation
    Then user Quit from the site
