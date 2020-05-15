package utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class GetProperty {

	public static String getProp(String propName) throws Exception
	{
		String propValue;
		Properties prop = new Properties();
		String projPath = System.getProperty("user.dir");
		InputStream file = new FileInputStream(projPath+"/src/test/java/config/config.properties");
		prop.load(file);
		propValue = prop.getProperty(propName);
		return propValue;
	}
}
