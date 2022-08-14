
@tag
Feature: 

  @tag1
  Scenario: 
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    And user click on login Button
    And User Click on master
    And user mousehover on rightside bar
    And User click on client
    And User click on Location
    And User clcik on edit button
    Then User Quit from site
    