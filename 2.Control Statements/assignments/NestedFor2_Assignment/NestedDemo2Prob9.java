class NestedDemo2Prob9{
    public static void main(String args[]) {

        //1C3  4B2  9A1
        //16C3 25B2 36A1
        //49C3 64B2 81A1

		int y=1;
		for(int i=1;i<=3;i++){
			char ch='C';
			int z=3;
			for(int j=1;j<=3;j++){
				System.out.print(y*y+""+ ch-- +""+z--+" ");
				y++;
			}
			System.out.println();
		}
    }
}