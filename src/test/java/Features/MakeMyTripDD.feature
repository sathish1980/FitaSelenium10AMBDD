@Sanity
Feature: Verify Makmytrip with DD
@Sanity
Scenario Outline: To verify search with vaalid values with param
Given Launch the browser and Enter the url
When i select the valid from location from table as <fromloc>
And  i select the valid to Location from table as <toloc>
And i select the valid date from table as <date>
And i click on Search button
And i wait for the popup and click on it
Then i get the search result and validate
Then I close the Browser

Examples: 
      |fromloc|toloc|date|
      |MAA|PNQ|26|
      |PNQ|MAA|28|