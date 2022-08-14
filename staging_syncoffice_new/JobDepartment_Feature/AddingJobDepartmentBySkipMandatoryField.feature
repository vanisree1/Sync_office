@tag
Feature: 

  @tag1
  Scenario: 
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then User click on login Button
    And User Click on master
    And User mousehover on rightside bar
    And User click on client
    And User click on Job department
    And User clike on Add
    And user Enter valid data job department fields by skip mandatory field
    And user click on save button
    Then User Quit from site
