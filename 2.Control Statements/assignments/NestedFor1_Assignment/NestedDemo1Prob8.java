class NestedDemo1Prob8{
    public static void main(String args[]) {
        //d d d d
        //c c c c
        //b b b b
        //a a a a

		char ch='d';
        	for(int i=1;i<=4;i++){
                for(int j=1;j<=4;j++){
                    //System.out.print((char)('\u0065'-i));
                    System.out.print(ch +" ");
                }
                ch--;
                System.out.println();
        	}
    }
}