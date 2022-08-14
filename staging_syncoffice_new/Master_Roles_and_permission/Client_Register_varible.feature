Feature: Client_Register_varible
  Scenario: Register_varible_data
    Given I launch chrome browser
    Given I launch chrome browser
    When I open Url "https://staging.syncoffice.com/module-website/login"
  ##  Then I Click on login button
    And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"
    And I Click on Login
    And Click on masters
   ## And Mouse over on module list
    And CLick on add button on client
    Then click  on Register Varible data
    Then page "Variable Data" should display
    Then Click on Add button on Register Varible data
    And Registraion value data
    Then Enter the Doucument name
    And Click on save button
