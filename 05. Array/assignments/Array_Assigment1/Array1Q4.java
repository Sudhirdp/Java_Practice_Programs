import java.io.*;

class Array1Q4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array: ");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Enter elements of array");

        //vowels of array
		char charr[]=new char[x];
		for(int i=0;i<charr.length;i++){
			charr[i]=(char)br.read();
			br.skip(1);
		}
		System.out.println("vowels from array: ");
		for(int i=0;i<charr.length;i++){
			if(charr[i]=='a' || charr[i]=='e' || charr[i]=='i'||charr[i]=='o'||charr[i]=='u'){
				System.out.println(charr[i]);
			}
		}
    }
}