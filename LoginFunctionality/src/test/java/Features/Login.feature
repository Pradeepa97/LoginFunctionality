@Login
Feature: Login Functionality


Scenario Outline: 1. Verify the Login Functionality with Valid Inputs.

Given the user enters the URL of the application
And gives the <Username> and <Password>
When the user click on the submit button
Then the user should see the HomePage of the application.
And the user close the application.

Examples:
|Username|Password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|

Scenario Outline: 2. Verify the Login Functionality with Invalid Inputs

Given the user enters the URL of the application
And gives the <Username> and <Password>
When the user click on the submit button
Then the user should be shown a error message.
And the user close the application.

Examples:
|Username|Password|
|STudent123|PStudent|
|pppp|lkd23|


Scenario Outline: 3. Verify the products in the Home Page(Data matches with a List of products)

Given the user enters the URL of the application
And gives the <Username> and <Password>
When the user click on the submit button
Then the user should see the HomePage of the application.
And user Verifies  <Product> in the HomePage
And the user close the application.

Examples:
|Username|Password|Product|
|standard_user|secret_sauce|Sauce Labs Bike Light|
|standard_user|secret_sauce|Sauce Labs Fleece Jacket|


Scenario Outline: 4. Verify the sorting functionality (Dropdwon)
Given the user enters the URL of the application
And gives the <Username> and <Password>
When the user click on the submit button
Then the user should see the HomePage of the application.
And user clicks on Dropdown 
And user selectes the option <Option>
And the user close the application.

Examples:
|Username|Password|Option|
|standard_user|secret_sauce|Name (Z to A)|
