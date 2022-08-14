
@tag
Feature: Validate Individual reminder

  @tag1
  Scenario: Validate Individual reminder
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button
    And user click on master module
    And user Hover the right slidebar 
    And user Click on General
    And user click on Individual reminder
    Then user Quit from the site
    