package generalComponent;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EmployeeSendGETRequest {
	
	public Response SendGET()
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employees";
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response object
		Response response = httpRequest.request(Method.GET,"");
		return response;
	}
}
