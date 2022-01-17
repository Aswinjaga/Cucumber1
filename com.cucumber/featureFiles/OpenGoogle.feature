Feature: This is to test Open Google
Scenario: Google search Scenario
Given user is entering google.co.in
When user is typing the search term "Vijay"
And enter the return key 
Then the user should see the search result