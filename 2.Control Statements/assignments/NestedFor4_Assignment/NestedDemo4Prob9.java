class NestedDemo4Prob9 {
    public static void main(String args[]) {

        //1
        //8 9
        //27 16 125
        //64 25 216 49

		for(int i=1;i<=4;i++){
			int x=i;
			for(int j=1;j<=i;j++){
				if(j%2==1){
					System.out.print(x*x*x +" ");
				} else{
					System.out.print(x*x +" ");
				}
				x++;
			}
			System.out.println();
		}
    }
}