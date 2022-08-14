
@tag
Feature: Validate Bank Details

@tag1
  Scenario: user successfully Validate Bank Details
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button
    And user click on master module
    And user Hover the right slidebar 
    And user Click on General
    And user click on Bank Details
    Then user Quit from the site