$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("endToEndTest.feature");
formatter.feature({
  "line": 1,
  "name": "End To end Test",
  "description": "",
  "id": "end-to-end-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "End to End test to add cheapest and second costliest item in cart for checkout with",
  "description": "details as \"FirstName\", \"LastName\" and \"PostalCode\"",
  "id": "end-to-end-test;end-to-end-test-to-add-cheapest-and-second-costliest-item-in-cart-for-checkout-with",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@(EndToEndTest)"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user is on product page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user sort out the price from high to low",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "prices for product must be in high to low",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user add cheapest and second costaliest price product to cart",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user navigate to cart page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "products should be added to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "click on Checkout link",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user must naviagte to checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user provide details for first name, LastName and postal Code as \"\u003cFirstName\u003e\", \"\u003cLastName\u003e\" , \"\u003cPostalCode\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "click on Continue link at checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user must navigate Checkout OverView Page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "added products should be visisble at checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user click on Finsih button at checkout overview page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "order must be completed",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "end-to-end-test;end-to-end-test-to-add-cheapest-and-second-costliest-item-in-cart-for-checkout-with;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "PostalCode"
      ],
      "line": 30,
      "id": "end-to-end-test;end-to-end-test-to-add-cheapest-and-second-costliest-item-in-cart-for-checkout-with;;1"
    },
    {
      "cells": [
        "firstName",
        "lastName",
        "postalCode"
      ],
      "line": 31,
      "id": "end-to-end-test;end-to-end-test-to-add-cheapest-and-second-costliest-item-in-cart-for-checkout-with;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7949706800,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "user is logged in",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user naviagte to the website of saucedemo.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user provide username as \"userName\" and password as \"password\" in through Login Window",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Login must be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefn_EndToEndTest.user_naviagte_to_the_website_of_saucedemo_com()"
});
formatter.result({
  "duration": 769969200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "userName",
      "offset": 26
    },
    {
      "val": "password",
      "offset": 53
    }
  ],
  "location": "StepDefn_EndToEndTest.user_provide_username_as_and_password_as_in_through_Login_Window(String,String)"
});
formatter.result({
  "duration": 807275700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn_EndToEndTest.click_on_Login_button()"
});
formatter.result({
  "duration": 622414700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn_EndToEndTest.login_must_be_successful()"
});
formatter.result({
  "duration": 98649100,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "End to End test to add cheapest and second costliest item in cart for checkout with",
  "description": "details as \"FirstName\", \"LastName\" and \"PostalCode\"",
  "id": "end-to-end-test;end-to-end-test-to-add-cheapest-and-second-costliest-item-in-cart-for-checkout-with;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@(EndToEndTest)"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user is on product page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user sort out the price from high to low",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "prices for product must be in high to low",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user add cheapest and second costaliest price product to cart",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user navigate to cart page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "products should be added to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "click on Checkout link",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user must naviagte to checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user provide details for first name, LastName and postal Code as \"firstName\", \"lastName\" , \"postalCode\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "click on Continue link at checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user must navigate Checkout OverView Page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "added products should be visisble at checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user click on Finsih button at checkout overview page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "order must be completed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefn_EndToEndTest.user_is_on_product_page()"
});
formatter.result({
  "duration": 188200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn_EndToEndTest.user_sort_out_the_price_from_high_to_low()"
});
formatter.result({
  "duration": 422041700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn_EndToEndTest.prices_for_product_must_be_in_high_to_low()"
});
formatter.result({
  "duration": 360353800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn_EndToEndTest.user_add_cheapest_and_second_costaliest_price_product_to_cart()"
});
formatter.result({
  "duration": 3634718300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn_EndToEndTest.user_navigate_to_cart_page()"
});
formatter.result({
  "duration": 339122700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn_EndToEndTest.products_should_be_added_to_the_cart()"
});
formatter.result({
  "duration": 37741800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn_EndToEndTest.click_on_Checkout_link()"
});
formatter.result({
  "duration": 278281200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn_EndToEndTest.user_must_naviagte_to_checkout_page()"
});
formatter.result({
  "duration": 63959300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstName",
      "offset": 66
    },
    {
      "val": "lastName",
      "offset": 79
    },
    {
      "val": "postalCode",
      "offset": 92
    }
  ],
  "location": "StepDefn_EndToEndTest.user_provide_details_for_first_name_LastName_and_postal_Code_as(String,String,String)"
});
formatter.result({
  "duration": 727493600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn_EndToEndTest.click_on_Continue_link_at_checkout_page()"
});
formatter.result({
  "duration": 315928600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn_EndToEndTest.user_must_navigate_Checkout_OverView_Page()"
});
formatter.result({
  "duration": 72589200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn_EndToEndTest.added_products_should_be_visisble_at_checkout_page()"
});
formatter.result({
  "duration": 23182000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn_EndToEndTest.user_click_on_Finsih_button_at_checkout_overview_page()"
});
formatter.result({
  "duration": 310593500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefn_EndToEndTest.order_must_be_completed()"
});
formatter.result({
  "duration": 65836500,
  "status": "passed"
});
formatter.after({
  "duration": 869854800,
  "status": "passed"
});
});