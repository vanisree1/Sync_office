@tag
Feature: unregistrated company

  @tag1
  Scenario: user successfully validate unregistrated company
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button
    And user click on master module
    And user Hover the right slidebar
    And user Click on General
    And user click on Registration Details
    And user click on groupCompany and select unregistered company
    And user click on Add
    And user enter GSTIN
    And user click on Save Button
    And user click on groupCompany and select Registered company
    Then user Quit from the site
