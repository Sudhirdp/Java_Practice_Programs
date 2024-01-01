class NestedDemo3Prob10{
    public static void main(String args[]) {

        //1 2 3 4
        //4 5 6
        //6 7
        //7

		int y=1;
		for(int i=4;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(y++ +" ");
			}
			y--;
			System.out.println();
		}
    }
}