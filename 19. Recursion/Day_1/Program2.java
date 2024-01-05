// what will be the output of below code 
//
class Demo{
	int fun(int num){
		if(num==0)
			return 1;
		return 5+fun(--num);
	}
	public static void main(String [] args){
		System.out.println(new Demo().fun(2));
	}
}

// 11
