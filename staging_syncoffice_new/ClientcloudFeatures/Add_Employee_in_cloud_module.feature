Feature: cloud module
  Scenario: Employee_to_company
    Given I launch chrome browser
    When I open Url "https://staging.syncoffice.com/module-website/login"
    And I enter UserName "chichkotebalaji@gmail.com" And Password "123456"
    And I Click on Login
    And Click on Cloud
    Then Click on Client Cloud
    Then Click on more icon
    Then click on Add employee tab
    Then Click add button on Employee List(cloud)
    Then Select basic information option(cloud)
    And Enter All mendetry fields on basic information(cloud)
    Then Select basic Company Related option(cloud)
    And Enter All mendetry fields on Company Related(cloud)
    Then Search Employee List which is currently added(cloud)
    Then Delete Employee List which is currently added(cloud)