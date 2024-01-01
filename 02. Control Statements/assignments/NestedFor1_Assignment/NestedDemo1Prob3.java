class NestedDemo1Prob3{
    public static void main(String args[]) {
        //14 14 14 14
        //15 15 15 15
        //16 16 16 15
        //17 17 17 17

		int x=14;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print(x+" ");
			}
            System.out.println();
			x++;
		}

        //alternatrive
		/*
		int n=13;
	        for(int i=1;i<=4;i++){
        		for(int j=1;j<=4;j++){
               		System.out.print(n+i+" ");
           		}
           		System.out.println();
        	}
		 */
    }
}