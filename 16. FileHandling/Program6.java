//writer

import java.io.*;

class FileDemo{
	public static void main(String [] args)throws IOException{
		File f = new File("Incubator.txt");			// this will not create the file it will only point at the file if available 
		FileWriter fw = new FileWriter(f,true);			// this constructor can take object of file here true means it will append the data if false then the data will be rewritten in the file , By default it have false in it 
		fw.write("Testing\n");
		fw.write("Frontend\n");
		fw.write("Salesforce\n");

		fw.close();
	}
}

