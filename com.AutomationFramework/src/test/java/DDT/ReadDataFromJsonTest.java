package DDT;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJsonTest {

	public static void main(String[] args) throws Throwable, IOException, ParseException  {
		//step 1: parse json physical file into java object using JSONParse class
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(new FileReader("C:\\Users\\Admin\\Desktop\\data\\appCommonData.json"));

		//Step 2: convert java object into jsonobject using down casting 
		JSONObject map=(JSONObject)obj;
		System.out.println(map.get("url"));
		System.out.println(map.get("browser"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		System.out.println(map.get("timeout"));
		
		

	}

}
