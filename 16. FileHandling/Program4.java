import java.io.*;

class FileDemo{
	public static void main(String [] args){
		File obj = new File("/home/prashik/Java_DSA/JAVA/Daily_Codes/FileHandling");
		System.out.println(obj.exists());

		String [] files = obj.list();
		for(String str : files){
			System.out.println(str);
		}
		int count = 0;
		for(String str : files){
			File f = new File(str);
			if(f.isFile()){
				count++;
			}
		}
		System.out.println(count);
	}
}


