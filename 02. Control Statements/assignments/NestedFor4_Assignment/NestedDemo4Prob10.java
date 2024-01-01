class NestedDemo4Prob10{
    public static void main(String args[]) {

        //1
        //8 9
        //9 64 25
        //64 25 216 49

		for(int i=1;i<=4;i++){
			int x=i;
			for(int j=1;j<=i;j++){
				if(x%2==1){
					System.out.print(x*x+" ");
				} else{
					System.out.print(x*x*x+" ");
				}
				x++;
			}
			System.out.println();
		}
    }
}