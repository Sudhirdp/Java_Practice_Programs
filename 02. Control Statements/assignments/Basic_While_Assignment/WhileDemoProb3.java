class WhileDemoProb3{
    public static void main(String[] args){
        //count of digits in a given number
		/*int x=193;
		int count=0;
		for(int i=x;i>0;i/=10){
			count++;
		}
		System.out.println(count);*/
        int x=193,count=0,i=x;
        while(i>0){
            count++;
            i/=10;
        }
        System.out.println(count);
    }
}