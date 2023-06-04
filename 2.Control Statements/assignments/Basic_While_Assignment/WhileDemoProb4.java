class WhileDemoProb4{
    public static void main(String[] args){

        //Count of odd digits of a given number
		/*int x=2536,count=0,temp;
		for(int i=x;i>0;i/=10){
			temp=i%10;
			if(temp%2==1){
				count++;
			}
		}
		System.out.println(count);*/
        int x=4253,count=0,temp,i=x;
        while(i>0){
            temp=i%10;
            if(temp%2==1){
                count++;
            }
            i/=10;
        }
        System.out.println(count);
    }
}