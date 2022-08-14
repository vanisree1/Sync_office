
@tag
Feature: Adding Department Invalid Department Name

  @tag1
  Scenario: Succesfully Adding Department Invalid Department Name
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button
    And User Click on master
    And user mousehover on rightside bar
    And User click on Employee
    And User click on department
    And User clike on Add and existing Add
    And user add the mandatory filed
    Then User Quit from site