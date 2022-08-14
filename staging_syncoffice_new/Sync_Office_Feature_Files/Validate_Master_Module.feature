@tag
Feature: Validate master module

  @tag1
  Scenario: user enterinto master module
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button
    And user click on master module
    And User click on add group company
    And User enter All the data
    Then Click on save
    And user click on the Edit option
    And user click on the Delete option
		Then user Quit from the site