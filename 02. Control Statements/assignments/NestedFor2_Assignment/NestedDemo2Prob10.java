class NestedDemo2Prob10{
    public static void main(String args[]) {

        //F 5 D 3 B 1
        //F 5 D 3 B 1
        //F 5 D 3 B 1
        //F 5 D 3 B 1
        //F 5 D 3 B 1
        //F 5 D 3 B 1

		for(int i=1;i<=6;i++){
			char ch='F';
			int x=6;
			for(int j=1;j<=6;j++){
				if(j%2==1){
					System.out.print(ch+" ");
				} else{
					System.out.print(x+" ");
				}
				x--;
				ch--;
			}
			System.out.println();
		}
    }
}