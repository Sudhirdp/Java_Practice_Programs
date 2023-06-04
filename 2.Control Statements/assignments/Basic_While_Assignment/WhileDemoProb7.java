class WhileDemoProb7{
    public static void main(String[] args){
        //if number is even print reverse ex-6 5 4 3 2 1 or if number is odd print with gap of 2 ex- 7 5 3 1
		/*int x=8,sub;
		if(x%2==0){
			sub=1;
		} else{
			sub=2;
		}
		for(int i=x;i>0;i=i-sub){
			System.out.println(i);
		}*/

        int x=8,i=x,sub;
        if(x%2==0){
            sub=1;
        } else{
            sub=2;
        }
        while(i>0){
            System.out.println(i);
            i=i-sub;
        }
    }
}