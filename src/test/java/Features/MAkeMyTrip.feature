#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@SIT
Feature: To verify Search Functionality
@SIT
Scenario: To verify search with vaalid values
Given Launch the browser and Enter the url
When i select the valid from location
And  i select the valid to Location
And i select the valid date
And i click on Search button
And i wait for the popup and click on it
Then i get the search result and validate
@SIT
Scenario: To verify search with valid values With param
Given Click On BackButton
When i select the valid from location as "MAA"
And  i select the valid to Location as "BLR"
And i select the valid date as "27"
And i click on Search button
And i wait for the popup and click on it
Then i get the search result and validate
@SIT
Scenario: To verify search with same city
Given Click On BackButton
When i select the valid from location
And  i select the valid to Location
Then i get the same city validation
Then I close the Browser
