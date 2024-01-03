//Desirialization

import java.io.*;

class Desirialization{
	public static void main(String []a )throws IOException,ClassNotFoundException{
		FileInputStream fis = new FileInputStream("Playerdata.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Player obj1 = (Player)ois.readObject();
		Player obj2 = (Player)ois.readObject();

		ois.close();
		fis.close();

		System.out.println("JerNo :"+ obj1.jerNo);
		System.out.println("PName : " + obj1.pName);

		System.out.println("JerNo : " + obj2.jerNo);
		System.out.println("PName : " + obj2.pName);
	}
}





