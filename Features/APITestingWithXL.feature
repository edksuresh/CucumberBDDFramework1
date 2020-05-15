Feature: Validation of employee data API with excel data

Scenario: API data comparison with excel data
Given User is triggering the GET request
When Response is received and saved in JSON format
And Validate the employee name and id are matching with excel sheet
