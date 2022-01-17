Feature: This is to login feature for OrangeHmr
Scenario Outline: Login OrangeHMR
Given  you are in login page of HRM
When  enter credentials username is"<Username>" and passowrd "<password>"
And click  login button of HRM

Examples:
|Username|password|
| Admin | admin123|

