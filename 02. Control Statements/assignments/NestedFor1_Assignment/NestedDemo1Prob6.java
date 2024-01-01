class NestedDemo1Prob6{
    public static void main(String args[]) {

        //9 8 7
        //9 8 7
        //9 8 7

		//int n=10;
        for (int i=1;i<=3;i++){
            int x=9;
            for(int j=1;j<=3;j++){
                //System.out.print(n-j+" ");
                System.out.print(x-- +" ");
            }
            System.out.println();
        }
    }
}