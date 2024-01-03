import java.io.*;

class FileDemo{
	public static void main(String [] agrs)throws IOException{
		FileWriter fw = new FileWriter("Incubator.txt");		//this will first check wheather the file is available if not then it will create the filee 
		fw.write("Flutter");
		fw.write("Backend");
		fw.write("Frontend");

		fw.close();
	}
}

