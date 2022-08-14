
@tag
Feature: cancel valid data

  @tag1
  Scenario: Succesfully cancel the valid Designation Name
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button
    And User Click on master
    And user mousehover on rightside bar
    And User click on Employee
    And User click on designation
    And User clike on Add and existing Add
    And user add only one field
    And User click on cancle
    Then User Quit from site