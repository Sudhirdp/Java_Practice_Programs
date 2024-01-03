//Serialization 

import java.io.*;

class Player implements Serializable{
	int jerNo =0;
	String pName ;
	Player(int jerNo,String pName){
		this.jerNo = jerNo;
		this.pName = pName;
	}
}
class SerializationDemo{
	public static void main(String[] args)throws IOException{
		Player obj1 = new Player(1,"KL Rahul");
		Player obj2 = new Player(45,"Rohit Sharma");

		FileOutputStream fos = new FileOutputStream("Playerdata.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(obj1);
		oos.writeObject(obj2);

		oos.close();
		fos.close();
	}
}


