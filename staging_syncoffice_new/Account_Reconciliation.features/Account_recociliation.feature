Feature: To Add GL Account
  Scenario: To Add GL Account
    Given   I launch chrome browser
    When I open Url "https://staging.syncoffice.com/module-website/login"
    And I enter UserName "sarika.mishra@candytechnologies.in" And Password "123456"
    And I Click on Login
    And 	Click on Account Reconciliation tab
    Then 	Hover on Right Side panel
    And 	Click on GL Account
    And 	Click on Add Button on View GL Account
    When 	Enter GL Account Code
    And 	Enter GL Description
    And 	Click on Add Button on GL Category
    And 	Enter All Mandatory fields on Gl Category
    And     Click on Gl Save Button
    And     Click on Add button on Legal Entity
    And     Enter All Mandatory fields on Legal Entity
    And     Click on Gl Save Button
    And     Click on Add button on Management Entity
    And     Enter All Mandatory fields on Management Entity
    And     Enter Gl Category, Legal Entity,Management Entity
    Then    Attach the file on Attachment option
    And     Click on Gl Save Button
    Then    Click on Attachment option on View GL Account page
    Then    click on add button to upload the fie
    Then    Click upload icon to upload the file and click on save
    Then    Go to the Attachment GL Account Page
    Then    Click on Replace icon to replace the file
    And     save and verify
    And     Search GL Account which is currently added
    And     Delete GL Account

#       When on click on header check box should enable delete icon
#       Then on click delete icon should open delete pop up

