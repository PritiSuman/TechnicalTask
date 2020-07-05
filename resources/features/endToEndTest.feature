Feature: End To end Test
Background: user is logged in

Given user naviagte to the website of saucedemo.com
When  user provide username as "userName" and password as "password" in through Login Window
And   click on Login button
Then  Login must be successful 

@(EndToEndTest)
Scenario Outline: End to End test to add cheapest and second costliest item in cart for checkout with 
details as "FirstName", "LastName" and "PostalCode"

Given user is on product page
When  user sort out the price from high to low
Then  prices for product must be in high to low 
When  user add cheapest and second costaliest price product to cart
And   user navigate to cart page
Then  products should be added to the cart
When  click on Checkout link
Then  user must naviagte to checkout page
When user provide details for first name, LastName and postal Code as "<FirstName>", "<LastName>" , "<PostalCode>"
And  click on Continue link at checkout page
Then user must navigate Checkout OverView Page
And  added products should be visisble at checkout page
When user click on Finsih button at checkout overview page 
Then order must be completed

Examples:

|FirstName|LastName|PostalCode|
|firstName|lastName|postalCode|



