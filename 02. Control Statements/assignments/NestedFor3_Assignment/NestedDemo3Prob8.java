class NestedDemo3Prob8{
    public static void main(String args[]) {

        //J
        //I H
        //G F E
        //D C B A

		char ch='J';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch-- +" ");
			}
			System.out.println();
		}
    }
}