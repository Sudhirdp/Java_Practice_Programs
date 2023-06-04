class NestedDemo4Prob6 {
    public static void main(String args[]) {

        //1
        //2 3
        //3 4 5
        //4 5 6 7

		int x=1;
		for(int i=1;i<=4;i++){
			int y=x;
			for(int j=1;j<=i;j++){
				System.out.print(y++ +" ");
			}
			x++;
			System.out.println();
		}
    }
}