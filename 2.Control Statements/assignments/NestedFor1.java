class NestedFor1{ 
	public static void main(String args[]){
	
	//print above patterns
		
		//C2W C2W C2W
		//C2W C2W C2W
		//C2W C2W C2W
		/*
		for(int i=1;i<=3;i++){
            		for (int j=1;j<=3;j++){
                		System.out.print("C2W ");
            		}
            		System.out.println();
        	}*/


		//4 5 6 7
		//4 5 6 7
		//4 5 6 7
		//4 5 6 7
		/*
		for (int i=1;i<=4;i++){
         		for (int j=1;j<=4;j++){
                		System.out.print(3+j+" ");
            		}	
            		System.out.println();
        	}*/

		//14 14 14 14
		//15 15 15 15
		//16 16 16 15
		//17 17 17 17
		/*
		int x=14
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.println(x);
			}
			x++;
		}*/

		//alternatrive
		/*
		int n=13;
	        for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
                		System.out.print(n+i+" ");
            		}
            		System.out.println();
        	}*/


		//1A 1A 1A
		//1A 1A 1A
		//1A 1A 1A
		/*
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
                		System.out.print("1A ");
            		}
            		System.out.println();
        	}*/

		//12 12 12
		//11 11 11
		//10 10 10
		/*
		int n=13;
        	for(int i=1;i<=3;i++){
            		for (int j=1;j<=3;j++){
                		System.out.print(13-j+" ");
            		}
            		System.out.println();
        	}*/

		//9 8 7
		//9 8 7
		//9 8 7
		/*
		//int n=10;
        	for (int i=1;i<=3;i++){
            		int x=9;
            		for(int j=1;j<=3;j++){
                		//System.out.print(n-j+" ");
                		System.out.print(x-- +" ");
            		}
            		System.out.println();
        	}*/

		//System.out.println('\u0065');          //unicode for e
        	//System.out.println((char)('\u0065'-1));      //unicode for d=\u0064 which is accessed using type casting
        	//System.out.println((char)('z'-1));    //we can go without type casting as well
        	//System.out.println((char)('M'-1));

		//D D D D
		//D D D D
		//D D D D
		//D D D D
		/*
		for(int i=1;i<=4;i++){
            		for(int j=1;j<=4;j++){
                		System.out.print('D' +" ");
            		}
            		System.out.println();
        	}*/

		//d d d d
		//c c c c
		//b b b b
		//a a a a
		/*
		char ch='d';
        	for(int i=1;i<=4;i++){
            		for(int j=1;j<=4;j++){
                		//System.out.print((char)('\u0065'-i));
                		System.out.print(ch +" ");
            		}
            		ch--;
            		System.out.println();
        	}*/

		//C B A
		//C B A
		//C B A
		/*
		for(int i=1;i<=3;i++){
            		System.out.print("C ");
            		while(true){
                		System.out.print("B ");
                		while(true){
                    			System.out.print("A ");
                    			break;
                		}
                		break;
            		}
            		System.out.println();
        	}*/

		//alternative
		/*
		for(int i=1;i<=3;i++){
            		char ch1='C';
            		for(int j=1;j<=3;j++){
                		System.out.print(ch1-- +" ");
            		}
            		System.out.println();
        	}*/

		//1 2 3 4
		//2 3 4 5
		//3 4 5 6
		//4 5 6 7
		/*
		for(int i=1;i<=4;i++){
            		int x=i;
            		for(int j=1;j<=4;j++){
                		//System.out.print(i+j-1+" ");
                		System.out.print(x++ +" ");
            		}
            		System.out.println();
        	}*/

	}
}
