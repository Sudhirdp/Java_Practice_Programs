class NestedDemo2Prob1{
    public static void main(String args[]) {
        //Print th following patterns

        //C2W1 C2W2 C2W3
        //C2W1 C2W2 C2W3
        //C2W1 C2W2 C2W3

		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print("C2W"+j+" ");
			}
			System.out.println();
		}
    }
}