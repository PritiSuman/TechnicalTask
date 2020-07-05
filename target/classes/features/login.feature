Feature: Login
 

Scenario: Login functionality

Given user naviagte to the website of saucedemo.com
When  user provide username as "userName" and password as "password" in through Login Window
And   click on Login button
Then  Login must be successful
