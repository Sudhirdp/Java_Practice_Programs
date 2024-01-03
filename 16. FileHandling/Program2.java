import java.io.*;

class FileDemo{
	public static void main(String [] args)throws IOException{
		File fobj = new File("NewFolder");
		fobj.mkdir();						// this will create a new folder of name given in the object argument

		File fobj2 = new File(fobj,"newFile");
		fobj2.createNewFile();					// this will create a file in the folder of the object given as parameter to object 

	}
}

