# TechnicalTask
## Selenium-Cucumber Framework

A Maven framework with selenium and cucumber tools

## Getting Started

 Perquisite: install JDK, Eclipse and Maven to run the project,
 Copy the repo into your local machine.

## Run tests locally using IDE
 Import project in eclipse IDE
 Expand project
 Right click the test runner class and select "Run" or "Debug" with Junit to start the test.


## Run tests through the command line
Go to root directory of project.
Run as mvn test

## Project Name: RBS-HomeTechnicalTask
## Framework Structure:

    # src/main/java : all supportive package and classes are kept in this folder

    -->	dataProvider
    #	ConfigFileReader: codes to read config files

    --> manager: 
    	Base: initialise Webdriver, java script executer and explicit wait methods
    	FileReaderManager: based on singleton design pattern, it manages the object for configFileReader
    	PageObjectManager: it manages the object creation for all the classes in pageobject package
   -->	pagePbject: As per selenium page factory design pattern, it has one class for each page like Login_Page, Product_page, Cart_Page etc.

     •	src/test/java
     	stepDefinitions: all glue code are kept in this folder
     	testRunner: junit test runner to run cucumber test

    •	resources: all the feature files
    	login.feature: all scenarios related to login
    	product.feature: all scenarios related to product feature
    	cart.feature: all scenarios for cart feature
    	checkout.feature: all scenarios for checkout 
    	checkoutOverview.feature: all scenarios related to checkoutOverview
    	endToEndTest.feature: end to end test scenarios from login to checkout of added products in cart
Note: scenarios have been written for all features but glue code is only available for end to end test

    •	src/driver: chrome driver is in this folder
    •	Config: 
    	Config.properties: all data which will be static throughout the project are kept in config file
    •	Target:
    	Cucumber-report: cucumber generated html report

    •	Pom.xml: all maven dependency to run the project

## Naming conventions:
Taken standard naming convention to understand by name what is objective of method classes and elements
e.g class: cart_Page—all the selenium elements and action done on that
method: clkCartLink: action to click on cart button
element cart_Link: element for cart link on cart page

## Built With
   •	Selenium - Browser automation framework
   •	Maven - Dependency management
   •	Cucumber- BDD tool
