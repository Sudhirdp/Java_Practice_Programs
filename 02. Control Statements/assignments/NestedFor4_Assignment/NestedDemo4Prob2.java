class NestedDemo4Prob2 {
    public static void main(String args[]) {

        //1
        //3 4
        //6 7 8
        //10 11 12 13
        //15 16 17 18 19

		int y=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(y++ +" ");
			}
			y++;
			System.out.println();
		}
    }
}