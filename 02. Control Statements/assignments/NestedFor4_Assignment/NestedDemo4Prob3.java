class NestedDemo4Prob3 {
    public static void main(String args[]) {

        //10
        //10 9
        //9 8 7
        //7 6 5 4

		int x=10;
		for(int i=1;i<=4;i++){
			int y=x;
			for(int j=1;j<=i;j++){
				System.out.print(y-- +" ");
			}
			x--;
			System.out.println();
		}
    }
}