
@tag
Feature: Login Page

  @tag1
  Scenario: Succesfully Login home page
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    And user click on login Button
    Then User Quit from site
    