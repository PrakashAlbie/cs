$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Cucumber/CucumberDemo/cucu.feature");
formatter.feature({
  "name": "Test Me App",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Login to TestMe App with location \"C:\\\\Users\\\\test\\\\Prakash\\\\chromedriver_win32\\\\chromedriver.exe\" and url \"http://192.168.40.4:8083/TestMeApp1\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Purchase.login_To_TestMe_App(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Login with username \"Lalitha\" and password \"Password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Purchase.i_Go_to_All_categories(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Navigate To Electronics",
  "keyword": "And "
});
formatter.match({
  "location": "Purchase.i_Navigate_To_Electronics()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on HeadPhone and Add to Cart",
  "keyword": "And "
});
formatter.match({
  "location": "Purchase.click_on_HeadPhone_and_Add_to_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Payment Page is Appeared",
  "keyword": "Then "
});
formatter.match({
  "location": "Purchase.the_Payment_Page_is_Appeared()"
});
formatter.result({
  "status": "passed"
});
});