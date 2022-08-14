@tag
Feature: Validate master module

  @tag1
  Scenario: user enterinto master module
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button
    And user click on master module
    And user Add location
    And user enter location Data
    And user click on Save
    And user edit_location
    And user delete Location
    Then user Quit from the site
