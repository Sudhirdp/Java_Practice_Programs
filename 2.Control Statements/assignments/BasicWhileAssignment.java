class BasicWhileAssignment{
	public static void main(String args[]){
		//Write a program to print/return :-
		//table of 2
		/*for(int i=1;i<=10;i++){
			System.out.println(2*i);
		}*/

		//factorial of number
		/*int num=5;
		int fact=1;
		for(int i=1;i<=5;i++){
			fact*=i;
		}
		System.out.println(fact);*/

		//count of digits in a given number
		/*int x=193;
		int count=0;
		for(int i=x;i>0;i/=10){
			count++;
		}
		System.out.println(count);*/

		//Count of odd digits of a given number
		/*int x=2536,count=0,temp;
		for(int i=x;i>0;i/=10){
			temp=i%10;
			if(temp%2==1){
				count++;
			}
		}
		System.out.println(count);*/

		//Square of even digits of a given number
		/*int x=9786,temp;
		for(int i=x;i>0;i/=10){
			temp=i%10;
			if(temp%2==0){
				System.out.println(temp*temp);
			}
		}*/
		

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

		//the countdown of days to submit the work
		/*int d=3;
		for(int i=i;i>0;i--){
			System.out.println(i+" Days remaining");
		}*/

		//reverse the given number
		/*int num=195,temp,rev=0;
		for(int i=num;i>0;i/=10){
			temp=i%10;
			rev=rev*10+temp;
		}
		System.out.println(rev);*/

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

	}
}
