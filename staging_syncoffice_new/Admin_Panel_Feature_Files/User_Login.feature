
Feature: Login_Page

  @tag1
  Scenario: User sucessfully Login Page
    Given open the browser and enter the url "https://preprod.syncoffice.com/admin/login.php"
    And Enter valid ursername "admin" and Enter the valid pwd "Syncoffice@2020"
    Then click on login
