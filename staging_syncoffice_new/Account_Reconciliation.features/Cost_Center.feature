Feature: To Add Cost Centre
  Scenario: Add Cost Centre
    Given I launch chrome browser
    When I open Url "https://staging.syncoffice.com/module-website/login"
    And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"
    And I Click on Login
    And 	Click on Account Reconciliation tab
    Then 	Hover on Right Side panel Cost Center
    And 	Click on Cost Center
    And 	Click on Add Button on View Cost Center
    And 	Enter Code on Cost Center
    And 	Enter Enter Description on Cost Center
    And 	Enter Remarks on Cost Center
    And 	Click on Save on Cost Center
    And     Search Cost Centre  which is currently added
    And     Delete Cost Centre


