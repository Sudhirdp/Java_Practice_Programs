class NestedDemo1Prob10{
    public static void main(String args[]) {
        //1 2 3 4
        //2 3 4 5
        //3 4 5 6
        //4 5 6 7

		for(int i=1;i<=4;i++){
            int x=i;
            for(int j=1;j<=4;j++){
                //System.out.print(i+j-1+" ");
                System.out.print(x++ +" ");
            }
            System.out.println();
        }
    }
}