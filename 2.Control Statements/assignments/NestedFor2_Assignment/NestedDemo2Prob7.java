class NestedDemo2Prob7{
    public static void main(String args[]) {
		//1 2 9
		//4 25 6
		//49 8 81

		int x=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				if(x%2==1){
					System.out.print(x*x +" ");
				} else{
					System.out.print(x+" ");
				}
				x++;
			}
			System.out.println();
		}
    }
}