class NestedDemo4Prob5 {
    public static void main(String args[]) {

        //A B C D
        //B C D
        //C D
        //D

		char ch1='A';
		for(int i=4;i>=1;i--){
			char ch2=ch1;
			for(int j=1;j<=i;j++){
				System.out.print(ch2++ +" ");
			}
			ch1++;
			System.out.println();
		}
    }
}