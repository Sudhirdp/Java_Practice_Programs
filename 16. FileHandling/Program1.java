import java.io.*;

class FileDemo{
	public static void main(String [] argrs)throws IOException{
		File fobj = new File("NewFile");
		fobj.createNewFile();
		System.out.println(fobj.exists());
	}
}
