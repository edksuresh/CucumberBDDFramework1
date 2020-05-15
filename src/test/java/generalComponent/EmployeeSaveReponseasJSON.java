package generalComponent;

import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.response.Response;

public class EmployeeSaveReponseasJSON {

	public HashMap<String, String> saveJSON(Response response) {
		
		String resBody = response.getBody().asString();
		HashMap<String, String> employeeDetails = new HashMap<String, String>();
		JSONParser jsonP = new JSONParser();
		try {
		Object obj = jsonP.parse(resBody);
		
		JSONArray array = new JSONArray();
		array.add(obj);
		System.out.println(array);
		
		JSONObject m = (JSONObject)obj;
		JSONArray my = (JSONArray)m.get("data");
		
		for(int i=0; i<=my.size()-1;i++)
		{
			JSONObject myo = (JSONObject) my.get(i);
			String id = (String) myo.get("id");
			String ename = (String) myo.get("employee_name");
			//System.out.println("ID: " + id + " Emp name: " + ename);
			employeeDetails.put(id, ename);
		}
		}catch(ParseException pe)
		{
			pe.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return employeeDetails;
	}
}
