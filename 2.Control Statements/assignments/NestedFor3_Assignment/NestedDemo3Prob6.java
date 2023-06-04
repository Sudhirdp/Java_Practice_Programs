class NestedDemo3Prob6{
    public static void main(String args[]) {

        //9
        //9 8
        //9 8 7
        //9 8 7 6

		for(int i=1;i<=4;i++){
			int y=9;
			for(int j=1;j<=i;j++){
				System.out.print(y--+" ");
			}
			System.out.println();
		}
    }
}