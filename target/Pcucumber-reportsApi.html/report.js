$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Android.feature");
formatter.feature({
  "name": "US001_Payment Screen Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@a101"
    }
  ]
});
formatter.scenario({
  "name": "tc01 Add product to the list and process",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@a101"
    }
  ]
});
formatter.step({
  "name": "a101 e girilir",
  "keyword": "Given "
});
formatter.match({
  "location": "AppiumTest.StepDefinitions.A101StepDefinitions.a101_e_girilir()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"io.appium.java_client.android.AndroidDriver.switchTo()\" because the return value of \"AppiumTest.utulities.Driver.get()\" is null\r\n\tat AppiumTest.StepDefinitions.A101StepDefinitions.a101_e_girilir(A101StepDefinitions.java:13)\r\n\tat ✽.a101 e girilir(file:///C:/Users/PC/IdeaProjects/A101_Appium_TestOtomasyon_Cucumber/src/test/resources/features/Android.feature:7)\r\n",
  "status": "failed"
});
});