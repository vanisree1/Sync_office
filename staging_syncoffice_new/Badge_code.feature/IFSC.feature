@tag
Feature: Create Bank by skipping mandatory field

  @tag1
  Scenario: user Unsuccessfully Create Bank
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button
    And user click on master module
    And user Hover the right slidebar
    And user Click on General
    And user click on Bank Details
    And user click on addButton 
    And Enter madantory flieds with IFSC code lessthan 11
    And user click on save Bank Details with IFSC code lessthan 11
    Then user Quit from the site
