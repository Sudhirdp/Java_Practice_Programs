class NestedDemo3Prob9{
    public static void main(String args[]) {
        //1
        //8 27
        //64 125 216

		int x=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=i;j++){
				System.out.print(x*x*x +" ");
				x++;
			}
			System.out.println();
		}
    }
}