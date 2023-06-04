class WhileDemoProb10{
    public static void main(String[] args){
        //check Whether a given number is palindrome or not
		/*int x=191,temp,rev=0;
		for(int i=x;i>0;i/=10){
			temp=i%10;
			rev=rev*10+temp;
		}
		if(rev==x){
			System.out.println("The given number is a palindrome");
		} else{
			System.out.println("was not a palindrome");
		}*/

        int x=191,temp,rev=0,i=x;
        while(i>0){
            temp=i%10;
            rev=rev*10+temp;
            i/=10;
        }
        if(rev==x){
            System.out.println("The given number is a palindrome");
        } else{
            System.out.println("was not a palindrome");
        }
    }
}