$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:JobDepartment_Feature/AddingJobDepartmentBySkipMandatoryField.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Openbrowser and enterURL \"https://preprod.syncoffice.com/module-website/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "JobDepartment_stepdef.openbrowser_and_enterURL(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d104.0.5112.81)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027VANISREEREDDY\u0027, ip: \u0027192.168.43.144\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_333\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 104.0.5112.81, chrome: {chromedriverVersion: 103.0.5060.53 (a1711811edd7..., userDataDir: C:\\Users\\vanis\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53260}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 278f0b51de3e4bf860aed49476cc0d9a\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:837)\r\n\tat JobDepartment_stepdef.JobDepartment_stepdef.openbrowser_and_enterURL(JobDepartment_stepdef.java:73)\r\n\tat ✽.Openbrowser and enterURL \"https://preprod.syncoffice.com/module-website/login\"(file:JobDepartment_Feature/AddingJobDepartmentBySkipMandatoryField.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "enter userName \"sarika.mishra@candytechnologies.in\" and passWord \"123456\"",
  "keyword": "When "
});
formatter.match({
  "location": "JobDepartment_stepdef.enter_userName_and_passWord(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "JobDepartment_stepdef.User_click_on_login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Click on master",
  "keyword": "And "
});
formatter.match({
  "location": "JobDepartment_stepdef.User_Click_on_master()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User mousehover on rightside bar",
  "keyword": "And "
});
formatter.match({
  "location": "JobDepartment_stepdef.User_mousehover_on_rightside_bar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on client",
  "keyword": "And "
});
formatter.match({
  "location": "JobDepartment_stepdef.user_click_on_client()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on Job department",
  "keyword": "And "
});
formatter.match({
  "location": "JobDepartment_stepdef.user_click_on_Job_department()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clike on Add",
  "keyword": "And "
});
formatter.match({
  "location": "JobDepartment_stepdef.user_clike_on_Add()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user Enter valid data job department fields by skip mandatory field",
  "keyword": "And "
});
formatter.match({
  "location": "JobDepartment_stepdef.user_Enter_valid_data_job_department_fields_by_skip_mandatory_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "JobDepartment_stepdef.user_click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Quit from site",
  "keyword": "Then "
});
formatter.match({
  "location": "JobDepartment_stepdef.user_Quit_from_site()"
});
formatter.result({
  "status": "skipped"
});
});