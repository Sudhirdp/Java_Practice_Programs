import java.util.*;
import java.io.*;

class PropertiesDemo{
	public static void main(String [] args)throws IOException{
		Properties obj = new Properties();
		
		FileInputStream fobj = new FileInputStream("Friends.properties");

		obj.load(fobj);

		String name = obj.getProperty("Kabir");
		System.out.println(name);
		
		obj.setProperty("Maitri","SSc");

		FileOutputStream outObj = new FileOutputStream("Friends.properties");

		obj.store(outObj,"Updated By me Prashik");
	}
}

		
