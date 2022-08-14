@tag
Feature: Login Page

  @tag1
  Scenario: Succesfully Login home page
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button
    And User Click on master
    And user mousehover on rightside bar
    And User click on Employee
    And User click on Type
    And User clike on Add and existing Add
    And user add only filed
    And user click on cancle Button
    Then User Quit from site
