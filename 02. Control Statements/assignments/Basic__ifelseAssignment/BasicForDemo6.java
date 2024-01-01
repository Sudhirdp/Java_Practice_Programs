class BasicForDemo6{
    public static void main(String[] args){
        //Write a program to print maximum between three numbers
		int a=10,b=34,c=2;
		if(a>b && a>c){
			System.out.println(a+" is the largest number among three");
		} else{
			if(b>a && b>c){
				System.out.println(b+" is largest number among three");
			} else{
				System.out.println(c+" is the largest of all");
			}
		}
    }
}