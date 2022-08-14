
@tag
Feature: Login Page
  I want to use this template for my feature file

  @tag1
  Scenario: Succesfully Login home page
    Given Openbrowser and enterURL "https://preprod.syncoffice.com/module-website/login"
    When enter userName "sarika.mishra@candytechnologies.in" and passWord "123456"
    Then user click on login Button