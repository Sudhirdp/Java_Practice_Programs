import java.io.*;

class ArrayAssignment1{
	public static void main(String[] args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());
		/*int mul=1;
		int arr[]=new int[x];
		for(int i=0;i<x;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				mul*=arr[i];
			}
		}
		System.out.println("Mul of even numbers: "+mul);*/

		/*char charr[]=new char[x];
		for(int i=0;i<charr.length;i++){
			charr[i]=(char)br.read();
			br.skip(1);
		}
		System.out.println("vowels from array: ");
		for(int i=0;i<charr.length;i++){
			if(charr[i]=='a' || charr[i]=='e' || charr[i]=='i'||charr[i]=='o'||charr[i]=='u'){
				System.out.println(charr[i]);
			}
		}*/

		int arr[]=new int[x];
		for(int i=0;i<x;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Numbers Divisible by 5 are: ");
		for(int i=0;i<x;i++){
			if(arr[i]%5==0){
				System.out.println(arr[i]);
                        }
		}
	}

	public void array1(int n) {
	}
}
