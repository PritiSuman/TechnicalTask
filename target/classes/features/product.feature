Feature: ProductSelection
 

Background: user is logged in and on product page

Given user naviagte to the website of saucedemo.com
When  user provide username as "userName" and password as "password" in through Login Window
And   click on Login button
Then  Login must be successful 


Scenario: Sort out product prices from high to low

Given user is on product page
When  user sort out the price from high to low
Then  prices for product must be in high to low 

Scenario: Sort out product prices from low to high

Given user is on product page
When  user sort out the price from low to high
Then  prices for product must be in low to high 


Scenario: Sort out product by name A to Z

Given user is on product page
When  user sort out the name A to Z 
Then  name of products must be in the A to Z order


Scenario: Sort out product by name A to Z

Given user is on product page
When  user sort out the name Z to A
Then  name of products must be in the Z to A order



Scenario: Add products to the cart

Given user is on product page 
When  user sort out the price from high to low
And   user add cheapest and second costaliest price product to cart
And   user navigate to cart page
Then  products should be added to the cart
