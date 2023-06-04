class NestedDemo4Prob4 {
    public static void main(String args[]) {

        //1 2 3 4
        //2 3 4
        //3 4
        //4

		int x=1;
		for(int i=4;i>=1;i--){
			int y=x;
			for(int j=1;j<=i;j++){
				System.out.print(y++ +" ");
			}
			x++;
			System.out.println();
		}
    }
}