package generalComponent;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getWeatherDetails {
	JsonPath jsonBody;
	public Response sendGETRequest(String cityName) {
		//Base URI
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response object
		Response response = httpRequest.request(Method.GET,cityName);
		
		return response;
		
	}
	
	public void checkData(String cityName, Response response)
	{
		JsonPath jsonBody;
		//to extract the individual key content
		jsonBody = response.jsonPath();
		
		String temp = jsonBody.get("Temperature");
		System.out.println(cityName + " - temperature is: " +temp);
		//to extract the individual key content
		
		String resBody = response.getBody().asString();
		
		//System.out.println("Response Body is: " + resBody);
		int sCode = response.getStatusCode();
		Assert.assertEquals(200,sCode);
		System.out.println(sCode);
		Assert.assertEquals(resBody.contains(cityName), true);

	}

}
