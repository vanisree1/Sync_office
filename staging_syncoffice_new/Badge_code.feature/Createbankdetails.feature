@tag
Feature: Create Bank

  @tag1
  Scenario: user successfully Create Bank
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button
    And user click on master module
    And user Hover the right slidebar
    And user Click on General
    And user click on Bank Details
    And user click on addButton and Enter all the madantory flieds
    And user click on save Bank Details
    Then user Quit from the site
