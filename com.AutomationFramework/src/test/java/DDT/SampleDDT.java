package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SampleDDT {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		System.out.println(p.getProperty("url"));
		

	}

}
