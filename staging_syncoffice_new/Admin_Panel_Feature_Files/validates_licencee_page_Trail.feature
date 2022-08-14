@tag
Feature: validates licencee page trail
  

  @tag1
  Scenario: Title of your scenario
     Given open the browser and enter the url "https://staging.syncoffice.com/admin/"
    And Enter valid ursername "admin" and Enter the valid pwd "Syncoffice@2020"
    Then click on login
    And user_Click licencee
    And click on Add licencee option
    And user_Select licence type(Trail)
    And enter Basic data
    Then user_Click_Submit