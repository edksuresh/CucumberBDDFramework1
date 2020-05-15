$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/APITestingWithXL.feature");
formatter.feature({
  "line": 1,
  "name": "Validation of employee data API with excel data",
  "description": "",
  "id": "validation-of-employee-data-api-with-excel-data",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "API data comparison with excel data",
  "description": "",
  "id": "validation-of-employee-data-api-with-excel-data;api-data-comparison-with-excel-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is triggering the GET request",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Response is received and saved in JSON format",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Validate the employee name and id are matching with excel sheet",
  "keyword": "And "
});
formatter.match({
  "location": "APItesting_StepDef.user_is_triggering_the_GET_request()"
});
formatter.result({
  "duration": 4789682200,
  "status": "passed"
});
formatter.match({
  "location": "APItesting_StepDef.response_is_received_and_saved_in_JSON_format()"
});
formatter.result({
  "duration": 50034200,
  "status": "passed"
});
formatter.match({
  "location": "APItesting_StepDef.validate_the_employee_name_and_id_are_matching_with_excel_sheet()"
});
formatter.result({
  "duration": 1866105200,
  "status": "passed"
});
});