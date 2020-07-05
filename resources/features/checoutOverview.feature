Feature: Checkout Overview Feature
 
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
Then  user is on checkout Page
When user provide details for first name, LastName and postal Code as "Firstname", "LastName" , "Postalcode"
And  click on Continue link at checkout page



Scenario: Finish checkout

Given user is on checkout overview Page
When user click on Finsih button at checkout overview page 
Then order must be completed

Scenario: Added products are visible at checkout overview page
Given user is on checkout overview Page
Then  added product must be on checkout overview page

