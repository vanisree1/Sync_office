
@tag
Feature: Add Designation with invalid data

  @tag1
  Scenario: Succesfully Add Designation with invalid Designation Name
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button
    And User Click on master
    And user mousehover on rightside bar
    And User click on Employee
    And User click on designation
    And User clike on Add and existing Add
    And user Enter fields with Invalid data
    Then User Quit from site