class NestedDemo2Prob6{
    public static void main(String args[]) {

        //1 4 9
        //16 25 36
        //49 64 81

		int y=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(y*y+" ");
				y++;
			}
			System.out.println();
		}
    }
}