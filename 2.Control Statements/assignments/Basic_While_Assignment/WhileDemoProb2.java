class WhileDemoProb2{
    public static void main(String[] args){

        //factorial of number
		/*int num=5;
		int fact=1;
		for(int i=1;i<=5;i++){
			fact*=i;
		}
		System.out.println(fact);*/
        int num=5;
        int fact=1,i=1;
        while(i<=5){
            fact*=i;
            i++;
        }
        System.out.println(fact);
    }
}