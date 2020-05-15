package utilities;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class ReadXLtoMap {

	public HashMap<String, String> getDataToMap() throws IOException
	{
		String path = "C:/Users/edksuresh/Downloads/employee_data.xlsx";
		 
		int rownum=ReadExcel.getRowCount(path, "Sheet1");
		int colnum=ReadExcel.getCellCount(path, "Sheet1", rownum);
		HashMap<String, String> empDataMap = new HashMap<String, String>();
		String[][] empData = new String[rownum][colnum];
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<=colnum;j++)
			{
				if (ReadExcel.getCellData(path, "Sheet1", i, j).isEmpty()==false)
				{
					empData[i-1][j] = ReadExcel.getCellData(path, "Sheet1", i, j);
				}
				//System.out.println(Utilis.getCellData(path, "Sheet1", i, j+1));
			}
		}
		empDataMap = (HashMap) ArrayUtils.toMap(empData);
		return empDataMap;
	}
	
	public static void empFound(HashMap<String, String> hmapAPI, HashMap<String, String> hmapXL)
	{
		boolean status=false;
		Set entrySet = hmapXL.entrySet();
		Iterator it = entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			if (hmapAPI.containsKey(me.getKey()) && hmapAPI.containsValue(me.getValue()))
			{
				System.out.println("Emp ID: " + me.getKey() + ", Emp Name: " + me.getValue() + " Found");
			}else
			{
				System.out.println("Emp ID: " + me.getKey() + ", Emp Name: " + me.getValue() + " NOT Found");
			}
		}
	}
}
