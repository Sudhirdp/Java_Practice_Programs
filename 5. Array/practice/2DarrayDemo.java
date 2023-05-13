import java.io.*;
class twoDarrayDemo{
	public static void main(String[] args)throws IOException{
		int arr[][]=new int[][]{{45,90},{1,56},{89,34}};
		/*for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/

		/*int arr2[][]=new int[3][];
		arr2[0]=new int[]{12,15,19};
		arr2[1]=new int[]{22,28};
		arr2[2]=new int[]{35};
		for(int[] x:arr2){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}*/

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Rows: ");
		int p=Integer.parseInt(br.readLine());
		int arr3[][]=new int[p][];
		System.out.println("Enetr the columns: ");
		for(int i=0;i<p;i++){
			int q=Integer.parseInt(br.readLine());
			arr3[i]=new int[q];
		}
		System.out.println("Enter the elements: ");
		for(int[] x:arr3){
			for(int y:x){
				y=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Output: ");
		for(int[] x:arr3){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}

//		for(int i=0;i<arr3.length;i++){
//			for(int j=0;j<arr3[i].length;j++){
//				arr3[i][j]=Integer.parseInt(br.readLine());
//			}
//		}
//		for(int i=0;i<arr3.length;i++){
//			for(int j=0;j<arr3[i].length;j++){
//				System.out.print(arr3[i][j]+" ");
//			}
//			System.out.println();
//		}

		/*int arr4[][]={{1,2,3},{4,5},{7}};
		int arr5[][]=new int[][];
		arr5[0]={1,2,3};
		arr5[1]={4,5};
		arr5[2]={7};*/

//		int arr6[][][]=new int[3][3][3];
//		for(int i=0;i<arr6.length;i++){
//			for(int j=0;j<arr6[i].length;j++){
//				for(int k=0;k<arr6[i][j].length;k++){
//					arr6[i][j][k]=i+j+k;
//				}
//			}
//		}
//		for(int i=0;i<arr6.length;i++){
//			for(int j=0;j<arr6[i].length;j++){
//				for(int k=0;k<arr6[i][j].length;k++){
//					System.out.print(arr6[i][j][k]+" ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}

//		int arr7[][]=new int[2][];
//		/*int arr8[]=new int[]{5,9,6,2,8};
//		int arr9[]=new int[]{4,7,1,4};
//		arr7[0]=arr8;
//		arr7[1]=arr9;*/
//		arr7[0]=new int[]{5,9,6,2,8};
//		arr7[1]=new int[]{4,7,1,4};
//		for(int[] x:arr7){
//			for(int y:x){
//				System.out.print(y+" ");
//			}
//			System.out.println();
//		}


	}

}
