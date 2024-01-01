class NestedDemo4Prob8 {
    public static void main(String args[]) {

        //10
        //I H
        //7 6 5
        //D C B A

		int x=10;
		char ch='J';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(x+" ");
				} else{
					System.out.print(ch+" ");
				}
				ch--;
				x--;
			}
			System.out.println();
		}
    }
}