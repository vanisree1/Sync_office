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
    And User clike on Add
    And User Click on fliter column select ALL from dropdown
    And user Enter exisiting Type in search box "Information technology"
    Then User Quit from site
