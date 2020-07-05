Feature: Checkout Feature
 
Background: User is on Checkout page

Given user naviagte to the website of saucedemo.com
When  user provide username as "userName" and password as "password" in through Login Window
And   click on Login button
Then  Login must be successful
And   user is on product page
When  user sort out the price from high to low
And   user add cheapest and second costaliest price product to cart
And  user navigate to cart page
And  click on Checkout link



Scenario Outline: Continue Checkout with details as "Firstname", "LastName" , "Postalcode"

Given user is on checkout Page
When user provide details for first name, LastName and postal Code as "Firstname", "LastName" , "Postalcode"
And  click on Continue link at cart page
Then user must navigate Checkout OverView Page

Examples:

|Firstname|LastName|Postalcode|
|abc|bcd|dfe|
|bgh|fgg|ghh|




