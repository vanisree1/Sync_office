
@tag
Feature: Validate Badge Code

  @tag1
  Scenario: Succesfully Login home page
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button
    And user click on master module
    And user Hover the right slidebar 
    And user Click on General
    And user click on Badge code 
    And user click on second  radio button
    Then user Quit from the site
    