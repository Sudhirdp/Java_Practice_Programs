class NestedDemo2Prob2{
    public static void main(String args[]) {

        //4 4 4 4
        //5 5 5 5
        //6 6 6 6
        //7 7 7 7

		int x=4;
		for(int i=0;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print(x+" ");
			}
			x++;
			System.out.println();
		}
    }
}