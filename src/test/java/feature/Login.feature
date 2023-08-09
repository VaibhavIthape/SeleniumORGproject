Feature: Verify Login Page with various Inputs

Background:
Given Open Orange HRM Site

@Login
Scenario Outline: Verify Login with valid credentials
Given User Enter Username and Password "<Username>" and "<Password>"
When Click on Login button
Then Verify User redirect on Home page 





Examples:
|  Username		|	 Password		|
|	Admin				|	  admin123	|