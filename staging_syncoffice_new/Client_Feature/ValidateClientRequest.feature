
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
    And User click on clients
    And User click on client request icon
    And User Enter valid basic info in mandatory field
    And User Enetr valid location fields
    And User Enetr valid admin field
    And User click on save
    Then User Quit from site
    