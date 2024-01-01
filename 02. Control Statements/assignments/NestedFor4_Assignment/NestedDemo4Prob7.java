class NestedDemo4Prob7 {
    public static void main(String args[]) {

        //F
        //E 1
        //D 2 E
        //C 3 D 4
        //B 5 C 6 D
        //A 7 B 8 C 9

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
		}
    }
}