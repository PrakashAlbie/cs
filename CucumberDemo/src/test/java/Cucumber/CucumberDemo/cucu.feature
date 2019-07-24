Feature: Test Me App


  Scenario: Launch Chrome and Load TestMe  
  	Given Login to TestMe App with location "C:\\Users\\test\\Prakash\\chromedriver_win32\\chromedriver.exe" and url "http://192.168.40.4:8083/TestMeApp"
   
    

  Scenario Outline: Login To TestMe
  	When I click on SignIn
  	And I Login with userName "<userName>" and password "<password>"
  Examples: 
  	| userName | password   |
    | Lalitha  | password123|

  Scenario: To Select the HeadPhone
  When I click on All Categories
  And I click on Electronics
  And I click on HeadPhone
  
  Scenario: Add to Cart
  When I click on Add to cart
  And I click on cart to proceed to checkout
  
  Scenario: Proceed to Payment
  When I click on Checkout
  And I click on proceed to payment button to move to payment page
  
  Scenario: To select the bank
  When I select the Bank
  And I click on continue
  
  Scenario Outline: Provide Payment Details
  When I login with username "<username>"
  And I provide password "<Password>"
  And I click on Login
  And I provide Transaction password "<TransPassword>"  
  
  Examples:
  	|username|Password|TransPassword|
  	|123460|Pass@460|Trans@460|
  
  Scenario: Signout
  When I complete my purchase
  And I click on Signout 
  
  
    

