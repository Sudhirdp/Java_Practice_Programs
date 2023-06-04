class WhileDemoProb6{
    public static void main(String[] args){
        //Sum of all even numbers and multiplication of all odd numbers between 1 to 10
		/*int sum=0,mul=1;
		for(int i=1;i<10;i++){
			if(i%2==0){
				sum+=i;
			} else{
				mul*=i;
			}
		}
		System.out.println("sum is "+sum+" and mul is "+mul);*/

        int sum=0,mul=1,i=1;
        while(i<10){
            if(i%2==0){
                sum+=i;
            } else{
                mul*=i;
            }
            i++;
        }
        System.out.println("sum is "+sum+" and mul is "+mul);
    }
}