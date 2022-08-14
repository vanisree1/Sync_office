Feature: Roles_and_permission_employee_permission
  Scenario: Set Roles and Permission (All Modules)
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"
    And I Click on Login
    And Click on masters
    And Mouse over on module list
    Then Click on Roles and Permissions tab
    And Click on the Employee Permissions SubTab
    When  Search Employee
    Then select the  Permission options for Modules
    Then Select Modules to apply to the specific Employee


  Scenario: Roles_and_permission__Employee_To_Client
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"
    And I Click on Login
    And Click on masters
    And  click on client should open list
    Then Click on Roles and Permissions tab
    And Click on Add Employee_To_Client
    Then Select the Client
    Then Select the Location
    Then Select the Department
    And Click on save button



  Scenario: To Assign Selected Employees to the Company
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"
    And I Click on Login
    And Click on masters
    And Mouse over on module list
    Then Click on Roles and Permissions tab
    And Click on Employee to Company
    When  Select Employee Company,Departments
    Then Click On Submit To Assign the Selected Company


  Scenario: To Assign Selected Staff a permissions
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"
    And I Click on Login
    And Click on masters
    And Mouse over on module list
    Then Click on Roles and Permissions tab
    Then Click on Client Name to give Permissions
    Then Select the type of permissions
    Then Click on Submit Button



  Scenario: To Assign Selected Staff to Clients
    Given I launch chrome browser
    When I open Url "https://www.syncoffice.com/module-test-dashboard/dashboard"
    Then I Click on login button
    And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"
    And I Click on Login
    And Click on masters
    And Mouse over on module list
    Then Click on Roles and Permissions tab
    And Click on Staff to Client
    When Select Client from the list
    Then Select Staff to Assign
    Then Select Locations of Selected Client


