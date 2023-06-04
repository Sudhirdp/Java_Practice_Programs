import java.io.*;

class SideArrayAssi{
	public static void main(String[] args)throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 4
		 * C C
		 * 2 2 2
		 * A A A A
		int x=4;
		char ch='D';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(x+" ");
				} else{
					System.out.print(ch+" ");
				}
			}
			x--;
			ch--;
			System.out.println();
		}*/

		/*
		 * 0
		 * 3 8
		 * 15 24 35
		 * 48 71 80 99
		int a=3;
		int d=2;
		System.out.println("Enter number of rows: ");
		int n=Integer.parseInt(br.readLine());
		int num;
		int count=0,sum=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				if(count==0){
					num=0;
				} else if(count==1){
					num=a;
				} else{
					num=a+(count-1)*d;
				}
				count++;
				System.out.print((sum+=num)+" ");
			}
			System.out.println();
		}*/

		/*
		 * a
		 * b a
		 * c b a
		 * d c b a
		char ch='a';
		for(int i=1;i<=4;i++){
			char ch1=ch;
			ch++;
			for(int j=1;j<=i;j++){
				System.out.print(ch1-- +" ");
			}
			System.out.println();
		}*/

		/*
		 * D C B A
		 * E D C B
		 * F E D C
		 * G F E D
		char ch='D';
		for(int i=1;i<=4;i++){
			char ch1=ch;
			ch++;
			for(int j=1;j<=4;j++){
				System.out.print(ch1-- +" ");
			}
			System.out.println();
		}*/

		/*
		 * D C B A
		 * E F G H
		 * F E D C
		 * G H I J
		char ch='D';
		for(int i=1;i<=4;i++){
			char ch1=ch;
			ch++;
			for(int j=1;j<=4;j++){
				if(i%2==0){
					System.out.print(ch1++ +" ");
				} else{
					System.out.print(ch1-- +" ");
				}
			}
			System.out.println();
		}*/

		/*System.out.println("Enter Number 1: ");
		System.out.print("Real Part : ");
		int x1=Integer.parseInt(br.readLine());
		System.out.print("Imaginary Part: ");
		int y1=Integer.parseInt(br.readLine());

		System.out.println("Enter Number 2: ");
		System.out.print("Real Part: ");
		int x2=Integer.parseInt(br.readLine());
		System.out.print("Imaginary Part: ");
		int y2=Integer.parseInt(br.readLine());

		int x= x1 + x2;
		int y= y1 + y2;
		System.out.println("The Addition of "+x1+"+"+y1+"i & "+x2+"+"+y2+"i is "+x+"+"+y+"i");*/
	
		/*
		System.out.print("Number of overs: ");
		int v=Integer.parseInt(br.readLine());
		int b=v*6;
		int[] arr=new int[b];
		System.out.print("Eneter Runs: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		
		int scount=0;
		int fcount=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==6){
				scount++;
			} else if(arr[i]==4){
				fcount++;
			} else{
				count++;	
			}
		}

		System.out.println("Total score: "+sum);
		System.out.println("Total number of balls: "+b);
		System.out.println("Total number of Sixes: "+scount);
		System.out.println("Total number of fours: "+fcount);
		System.out.println("Total number of others: "+count);*/
	
		/*
		System.out.println("Enter the size of array: ");
		int x=Integer.parseInt(br.readLine());
		int[] arr1=new int[x];
		int[] arr2=new int[x];

		System.out.println("Enter the elements of array: ");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
			if(arr1[i]%2==0){
				arr2[i]=1;
			} else{
				arr2[i]=0;
			}
		}

		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}*/

		/*
		System.out.println("Enter the number of students: ");
		int b=Integer.parseInt(br.readLine());
		int[][] arr1=new int[b][];
		System.out.println("Enter the rows");
		for(int i=0;i<arr1.length;i++){
			int a=Integer.parseInt(br.readLine());
			arr1[i]=new int[a];
		}
		int sum=0;
		for(int i=0;i<arr1.length;i++){
			System.out.print("Enter the marks of the "+i+" th student: ");
			for(int j=0;j<arr1[i].length;j++){
				arr1[i][j]=Integer.parseInt(br.readLine());
				if(i==0){
					sum+=arr1[i][j];
				}
			}
		}
		System.out.println("Average of student 1 is: "+sum);*/

		/*
		System.out.print("Enter number of planes: ");
		int x=Integer.parseInt(br.readLine());
		System.out.print("Enter number of rows: ");
		int y=Integer.parseInt(br.readLine());
		System.out.print("Enter number of columns: ");
		int z=Integer.parseInt(br.readLine());
		int arr2[][][]=new int[x][y][z];

		int sum=0;
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
				for(int k=0;k<arr2[i][j].length;k++){
					arr2[i][j][k]=Integer.parseInt(br.readLine());
				}
			}
		}
		for(int i=0;i<arr2[0].length;i++){
			for(int j=0;j<arr2[0][i].length;j++){
				sum+=arr2[0][i][j];
			}
		}
		System.out.println(sum);*/

	}
}
