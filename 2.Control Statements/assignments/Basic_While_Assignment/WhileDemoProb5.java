class WhileDemoProb5{
    public static void main(String[] args){
        //Square of even digits of a given number
		/*int x=9786,temp;
		for(int i=x;i>0;i/=10){
			temp=i%10;
			if(temp%2==0){
				System.out.println(temp*temp);
			}
		}*/

        int x=14243,i=x,temp;
        while(i>0){
            temp=i%10;
            if(temp%2==0){
                System.out.println(temp*temp);
            }
            i/=10;
        }
    }
}