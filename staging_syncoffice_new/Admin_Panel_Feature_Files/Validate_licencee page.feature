@tag
Feature: validates licencee page  feature_File
  I want to use this template for my feature file

  @tag1
  Scenario: validates licencee page
    Given open the browser and enter the url "https://staging.syncoffice.com/admin/"
    And Enter valid ursername "admin" and Enter the valid pwd "Syncoffice@2020"
    Then click on login
    And user_Click licencee
    And click on Add licencee option
    And user_Select licence type
    Then user_Click_Submit
    And user_Click licencee
    And user_click_view in active recoreds
    And user Click on the active button
    And click on ok
    
