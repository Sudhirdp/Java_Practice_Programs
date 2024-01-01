class WhileDemoProb9{
    public static void main(String[] args){
        //reverse the given number
		/*int num=195,temp,rev=0;
		for(int i=num;i>0;i/=10){
			temp=i%10;
			rev=rev*10+temp;
		}
		System.out.println(rev);*/

        int num=195,temp,rev=0,i=num;
        while(i>0){
            temp=i%10;
            rev=rev*10+temp;
            i/=10;
        }
        System.out.println(rev);
    }
}