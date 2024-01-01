import java.util.*;

class arrayDemo2{
	
	public static void main(String args[]){
		/*int arr2[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			arr2[i]=sc.nextInt();
		}
		System.out.println(arr2[2]);
		System.out.println(arr2);//this particular line gives output => addressof variable */

		int[] arr3=new int[]{2,4,5,6,3};
		int[] arr4=new int[]{2,4,5,6,3};
		System.out.println(System.identityHashCode(arr3));
		System.out.println(System.identityHashCode(arr3[0]));
		System.out.println(System.identityHashCode(arr3[1]));
//		System.out.println(System.identityHashCode(arr3[2]));

		System.out.println();
		System.out.println(System.identityHashCode(arr4));
		System.out.println(System.identityHashCode(arr4[0]));
		System.out.println(System.identityHashCode(arr4[1]));

		/*int arr3[];
		arr3={1,2,3,4};
		for(int i=0;i<arr3.length;i++){
			System.out.println(arr3[i]+" ");
		} */
		//gives 2errors: not a statement and illegal start of type


		/*arrayDemo2[] arr4=new arrayDemo2[5];
		for(int i=0;i<arr4.length;i++){
                        System.out.println(arr4[i]+" ");
                }*/
		//gives a empty array
		
		//ArrayOutOfBounds is an exception and also an error
	}
}
