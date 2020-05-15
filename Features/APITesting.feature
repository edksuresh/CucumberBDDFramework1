Feature: API testing using REST Assured 

Scenario Outline: GET weather details 
	Given User is sending the GET request for Weather API for the given city "<CityName>" 
	And validate the STAT Code and CityDetails "<CityName>" in JSON Body 
	
	Examples: 
		|CityName|
		|Chennai|
		|Delhi|
		|Hyderabad|
