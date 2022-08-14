
@tag
Feature: Designation

  @tag1
  Scenario: Succesfully Fliter the Colume With an Exisiting Name
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button
    And User Click on master
    And user mousehover on rightside bar
    And User click on Employee
    And User click on designation
    And User clike on Add
    And User Click on edit
    Then User Quit from site