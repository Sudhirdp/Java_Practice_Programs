class NestedFor2{
	public static void main(String[] args){
		//Print th following patterns
		
		//C2W1 C2W2 C2W3
		//C2W1 C2W2 C2W3
		//C2W1 C2W2 C2W3
		/*
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print("C2W"+j);
			}
			System.out.println();
		}*/

		//4 4 4 4
		//5 5 5 5
		//6 6 6 6
		//7 7 7 7
		/*
		int x=4;
		for(int i=0;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print(x+" ");
			}
			x++;
			System.out.println();
		}*/

		//14 15 16 17
		//15 16 17 18
		//16 17 18 19
		//17 18 19 20
		/*
		for(int i=1;i<=4;i++){
			int y=13+i;
			for(int j=1;j<=4;j++){
				System.out.print(y+j-1+" ");
			}
			System.out.println();
		}*/

		//1A 2B 3C
		//1A 2B 3C
		//1A 2B 3C
		/*
		for(int i=1;i<=3;i++){
			char ch='A';
			for(int j=1;j<=3;j++){
				System.out.print(j+""+ch+" ");
			}
			System.out.println();
		}*/

		//26 Z 25 Y
		//24 X 23 W
		//22 V 21 U
		//20 T 19 S
		/*
		int x=26;
		char ch='Z';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==1){
					System.out.print(x-- +" ");
				} else{
					System.out.print(ch-- +" ");
				}
			}
			System.out.println();
		}*/

		//1 4 9
		//16 25 36
		//49 64 81
		/*
		int y=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(y*y+" ");
				y++;
			}
			System.out.println();
		}*/

		//1 2 9
		//4 25 6
		//49 8 81
		/*
		int x=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				if(x%2==1){
					System.out.print(x*x +" ");
				} else{
					System.out.print(x+" ");
				}
				x++;
			}
			System.out.println();
		}*/

		//A b C d
		//E f G h
		//I j K l
		//M n O p
		/*
		char ch1='A',ch2='a';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==1){
					System.out.print(ch1 +" ");
				} else{
					System.out.print(ch2 +" ");
				}
				ch1++;
				ch2++;
			}
			System.out.println();
		}*/

		//1C3  4B2  9A1
		//16C3 25B2 36A1
		//49C3 64B2 81A1
		/*
		int y=1;
		for(int i=1;i<=3;i++){
			char ch='C';
			int z=3;
			for(int j=1;j<=3;j++){
				System.out.print(y*y+""+ ch-- +""+z--+" ");
				y++;
			}
			System.out.println();
		}*/

		//F 5 D 3 B 1
		//F 5 D 3 B 1
		//F 5 D 3 B 1
		//F 5 D 3 B 1 
		//F 5 D 3 B 1
		//F 5 D 3 B 1
		/*
		for(int i=1;i<=6;i++){
			char ch='F';
			int x=6;
			for(int j=1;j<=6;j++){
				if(j%2==1){
					System.out.print(ch+" ");
				} else{
					System.out.print(x+" ");
				}
				x--;
				ch--;
			}
			System.out.println();
		}*/
	}
}
