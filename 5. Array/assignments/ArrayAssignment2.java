import java.io.*;

class ArrayAssignment2{
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of First array: ");
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		System.out.println("Enter elements of First array: ");
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

//		System.out.println("Enter size of Second array: ");
//		int m=Integer.parseInt(br.readLine());
//		int arr2[]=new int[m];
//		System.out.println("Enter elements of Second array: ");
//		for(int i=0;i<arr2.length;i++){
//			arr2[i]=Integer.parseInt(br.readLine());
//		 }

		//sum of all elements of array
//		int sum=0;
//		for(int i=0;i<arr.length;i++){
//			sum+=arr[i];
//		}
//		System.out.println("Sum of all elemnts of an array is:"+sum);

		//Write a program to print count of odd and even number of elements in array
//		int codd=0,ceven=0;
//		for(int i=0;i<arr.length;i++){
//			if(arr[i]%2==1){
//				codd++;
//			} else {
//				ceven++;
//			}
//		}
//		System.out.println("Count of even numbers in array is:- "+ceven);

		//sum of odd and sum of even numbers
//		int osum=0,esum=0;
//		for(int i=0;i<arr.length;i++){
//			if(arr[i]%2==1){
//				osum+=arr[i];
//			} else{
//				esum+=arr[i];
//			}
//		}
//		System.out.println("Sum of odd numbers of array is: "+osum);
//		System.out.println("Sum of even numbers of an array is: "+esum);

		//To search element of an array and return it with its index
//		int se=Integer.parseInt(br.readLine());
//		for(int i=0;i<arr.length;i++){
//			if(arr[i]==se){
//				System.out.println(arr[i]+" Found at index "+i);
//				break;
//			}
//		}

		//Write a program to print minimum of an array
//		int min=arr[0];
//		for(int i=1;i<arr.length;i++){
//			if(arr[i]<min){
//				min=arr[i];
//			}
//		}
//		System.out.println("Smallest element of an array is: "+min);

		//Write a program to print maximum element of an array
//		int max=arr[0];
//		for(int i=0;i<arr.length;i++){
//			if(arr[i]>max){
//				max=arr[i];
//			}
//		}
//		System.out.println("Largest element from array is: "+max);

		//Write a program to print common elements of an array
//		System.out.println("Common elements are: ");
//		for(int i=0;i<n;i++){
//			for(int j=0;j<m;j++){
//				if(arr[i]==arr2[j]){
//					System.out.print(arr[i]+" ");
//					break;
//				}
//			}
//		}

		//Write a program to print uncommon elements between two arrays
//		System.out.println("uncommon elements of array are: ");
//		for(int i=0;i<arr.length;i++){
//			int common=0;
//			for(int j=0;j<arr2.length;j++){
//				if(arr[i]==arr2[j]){
//					common++;
//				}
//			}
//			if(common==0){
//				System.out.println(arr[i]);
//			}
//		}
//		for(int i=0;i<arr2.length;i++){
//			int common=0;
//			for(int j=0;j<arr.length;j++){
//				if(arr2[i]==arr[j]){
//					common++;
//				}
//			}
//			if(common==0){
//				System.out.println(arr2[i]);
//			}
//		}

		//Write a program to print merged array of two elements
//		int arr3[]=new int[(arr.length+arr2.length)];
//		for(int i=0;i<arr.length;i++){
//			arr3[i]=arr[i];
//		}
//		for(int i=0;i<arr2.length;i++){
//			arr3[arr.length+i]=arr2[i];
//		}
//		for(int i=0;i<arr.length+arr2.length;i++){
//			System.out.println(arr3[i]);
//		}

		//Write a program to print elements whose addition of digits is even
//		for(int i=0;i<arr.length;i++){
//			int x=arr[i];
//			int sum=0;
//			while(x>0){
//				temp=x%10;
//				sum+=temp;
//				x/=10;
//			}
//			if(sum%2==0){
//				System.out.println(arr[i]);
//			}
//		}

	}
}
