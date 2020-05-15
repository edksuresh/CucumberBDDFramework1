package StepDefinition;

import java.util.HashMap;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import generalComponent.EmployeeSaveReponseasJSON;
import generalComponent.EmployeeSendGETRequest;
import generalComponent.getWeatherDetails;
import io.restassured.response.Response;
import utilities.ReadXLtoMap;
public class APItesting_StepDef {
	Response response;
	getWeatherDetails getWeather = new getWeatherDetails();
	EmployeeSendGETRequest sendGET = new EmployeeSendGETRequest();
	EmployeeSaveReponseasJSON saveRes = new EmployeeSaveReponseasJSON();
	ReadXLtoMap rxl = new ReadXLtoMap();
	HashMap<String, String> hmapAPI = new HashMap<String, String>();
	HashMap<String, String> hmapXL = new HashMap<String, String>();
	
	
@Given("^User is sending the GET request for Weather API for the given city \"([^\"]*)\"$")
public void user_is_sending_the_GET_request_for_Weather_API_for_the_given_city(String arg1) throws Throwable {
	response = getWeather.sendGETRequest(arg1);
}

@Given("^validate the STAT Code and CityDetails \"([^\"]*)\" in JSON Body$")
public void validate_the_STAT_Code_and_CityDetails_in_JSON_Body(String arg1) throws Throwable {
	getWeather.checkData(arg1, response);
}

// API testing with excel input


@Given("^User is triggering the GET request$")
public void user_is_triggering_the_GET_request() throws Throwable {
	response = sendGET.SendGET();
}

@When("^Response is received and saved in JSON format$")
public void response_is_received_and_saved_in_JSON_format() throws Throwable {
	hmapAPI = saveRes.saveJSON(response);
}

@When("^Validate the employee name and id are matching with excel sheet$")
public void validate_the_employee_name_and_id_are_matching_with_excel_sheet() throws Throwable {
	hmapXL = rxl.getDataToMap();
	rxl.empFound(hmapAPI, hmapXL);
}


	
}
