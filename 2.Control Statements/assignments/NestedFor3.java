class NestedFor3{
	public static void main(String args[]){
		//
		//C2W
		//C2W C2W
		//C2W C2W C2W
		//C2W C2W C2W C2W
		/*
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print("C2W ");
			}
			System.out.println();
		}*/

		//1 
		//2 3 
		//4 5 6
		//7 8 9 10
		/*
		int x=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(x+++" ");
			}
			System.out.println();
		}*/

		//10
		//9 8
		//7 6 5 
		//4 3 2 1
		/*
		int y=10;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(y--+" ");
			}
			System.out.println();
		}*/

		//3C 3C 3C 3C
		//3C 3C 3C
		//3C 3C
		//3C
		/*
		for(int i=4;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("3C ");
			}
			System.out.println();
		}*/

		//10 10 10 10
		//11 11 11
		//12 12
		//13
		/*
		int x=10;
		for(int i=1;i<=4;i++){
			for(int j=4;j>=i;j--){
				System.out.print(x+" ");
			}
			x++;
			System.out.println();
		}*/

		//9
		//9 8
		//9 8 7
		//9 8 7 6
		/*
		for(int i=1;i<=4;i++){
			int y=9;
			for(int j=1;j<=i;j++){
				System.out.print(y--+" ");
			}
			System.out.println();
		}*/

		//F
		//E F
		//D E F
		//C D E F
		//B C D E F
		//A B C D E F
		/*
		char ch='F';
		for(int i=1;i<=6;i++){
			char ch1=ch;
			for(int j=1;j<=i;j++){
				System.out.print(ch1++ +" ");
			}
			ch--;
			System.out.println();
		}*/

		//J
		//I H
		//G F E
		//D C B A
		/*
		char ch='J';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch-- +" ");
			}
			System.out.println();
		}*/

		//1
		//8 27
		//64 125 216
		/*
		int x=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=i;j++){
				System.out.print(x*x*x +" ");
				x++;
			}
			System.out.println();
		}*/

		//1 2 3 4
		//4 5 6
		//6 7
		//7
		/*
		int y=1;
		for(int i=4;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(y++ +" ");
			}
			y--;
			System.out.println();
		}*/

	}
}
