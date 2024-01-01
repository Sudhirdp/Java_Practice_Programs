class NestedDemo2Prob3{
    public static void main(String args[]) {

        //14 15 16 17
        //15 16 17 18
        //16 17 18 19
        //17 18 19 20

		for(int i=1;i<=4;i++){
			int y=13+i;
			for(int j=1;j<=4;j++){
				System.out.print(y+j-1+" ");
			}
			System.out.println();
		}
    }
}