class NestedFor4{
	public static void main(String args[]){
		//
		//C2W10
		//C2W9 C2W8
		//C2W7 C2W6 C2W5
		//C2W4 C2W3 C2W2 C2W1
		/*
		int x=10;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print("C2W"+ x-- +" ");
			}
			System.out.println();
		}*/

		//1
		//3 4 
		//6 7 8 
		//10 11 12 13 
		//15 16 17 18 19
		/*
		int y=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(y++ +" ");
			}
			y++;
			System.out.println();
		}*/

		//10 
		//10 9 
		//9 8 7 
		//7 6 5 4
		/*
		int x=10;
		for(int i=1;i<=4;i++){
			int y=x;
			for(int j=1;j<=i;j++){
				System.out.print(y-- +" ");
			}
			x--;
			System.out.println();
		}*/

		//1 2 3 4
		//2 3 4
		//3 4
		//4
		/*
		int x=1;
		for(int i=4;i>=1;i--){
			int y=x;
			for(int j=1;j<=i;j++){
				System.out.print(y++ +" ");	
			}
			x++;
			System.out.println();
		}*/

		//A B C D
		//B C D
		//C D
		//D
		/*
		char ch1='A';
		for(int i=4;i>=1;i--){
			char ch2=ch1;
			for(int j=1;j<=i;j++){
				System.out.print(ch2++ +" ");
			}
			ch1++;
			System.out.println();
		}*/

		//1 
		//2 3
		//3 4 5
		//4 5 6 7
		/*
		int x=1;
		for(int i=1;i<=4;i++){
			int y=x;
			for(int j=1;j<=i;j++){
				System.out.print(y++);
			}
			x++;
			System.out.println();
		}*/

		//F
		//E 1
		//D 2 E
		//C 3 D 4 
		//B 5 C 6 D
		//A 7 B 8 C 9
		/*
		char ch='F';
		int x=1;
		for(int i=1;i<=6;i++){
			char ch2=ch;
			for(int j=1;j<=i;j++){
				if(j%2==1){
					System.out.print(ch2++ +" ");
				} else{
					System.out.print(x++ +" ");
				}
			}
			ch--;
			System.out.println();
		}*/

		//10
		//I H
		//7 6 5
		//D C B A
		/*
		int x=10;
		char ch='J';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(x+" ");
				} else{
					System.out.print(ch+" ");
				}
				ch--;
				x--;
			}
			System.out.println();
		}*/

		//1
		//8 9
		//27 16 125
		//64 25 216 49
		/*
		for(int i=1;i<=4;i++){
			int x=i;
			for(int j=1;j<=i;j++){
				if(j%2==1){
					System.out.print(x*x*x +" ");
				} else{
					System.out.print(x*x +" ");
				}
				x++;
			}
			System.out.println();
		}*/

		//1
		//8 9
		//9 64 25
		//64 25 216 49
		/*
		for(int i=1;i<=4;i++){
			int x=i;
			for(int j=1;j<=i;j++){
				if(x%2==1){
					System.out.print(x*x+" ");
				} else{
					System.out.print(x*x*x+" ");
				}
				x++;
			}
			System.out.println();
		}*/

	}
}
