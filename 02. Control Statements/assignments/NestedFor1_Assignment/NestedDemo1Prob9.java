class NestedDemo1Prob9{
    public static void main(String args[]) {

        //C B A
        //C B A
        //C B A

		for(int i=1;i<=3;i++){
            System.out.print("C ");
            while(true){
                System.out.print("B ");
                while(true){
                    System.out.print("A ");
                    break;
                }
                break;
            }
            System.out.println();
        }

        //alternative
        /*
		for(int i=1;i<=3;i++){
            char ch1='C';
            for(int j=1;j<=3;j++){
                System.out.print(ch1-- +" ");
            }
            System.out.println();
        }*/
    }
}