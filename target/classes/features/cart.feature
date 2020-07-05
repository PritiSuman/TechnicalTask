Feature: Cart Feature
 
Background: User added the products in cart

Given user naviagte to the website of saucedemo.com
When  user provide username as "userName" and password as "password" in through Login Window
And   click on Login button
Then  Login must be successful
And   user is on product page
When  user sort out the price from high to low
And   user add cheapest and second costaliest price product to cart


Scenario: Remove product from cart

Given user navigate to cart page
When click on remove button
Then added product in cart must be removed

Scenario: click on Continue shopping button on cart page

Given user navigate to cart page
When click on Continue shopping button
Then user must move to product page for shopping


Scenario: click on Checkout link in cart page

Given user navigate to cart page
When click on Checkout link
Then user must naviagte to checkout page

