class NestedDemo3Prob7{
    public static void main(String args[]) {

        //F
        //E F
        //D E F
        //C D E F
        //B C D E F
        //A B C D E F

		char ch='F';
		for(int i=1;i<=6;i++){
			char ch1=ch;
			for(int j=1;j<=i;j++){
				System.out.print(ch1++ +" ");
			}
			ch--;
			System.out.println();
		}
    }
}