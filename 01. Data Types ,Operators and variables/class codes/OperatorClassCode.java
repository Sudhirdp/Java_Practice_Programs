class OperatorClassCode{

	static int x=10;

	public static void main(String[] args){
		byte var1=18;
		byte var2=18;
		var1=(byte)(var1+var2);
		System.out.println(var1);	//36
		System.out.println(var2);	//18*/
						
		/*float f1=12.5f;
		double d1=12.5;
		System.out.println(f1+d1);	//25.0*/
						
		//System.out.println(x); //10 here x is static so we can access it in main

		//operators
		
		/*int x=8;
		int y=5;
		int ans1=++x + x++;
		int ans2=--y + y--;
		System.out.println(ans1);	//18
		System.out.println(ans2);	//8
		System.out.println(x);		//10
		System.out.println(y);		//3*/
						
		/*int x=10;
		System.out.println(++x);	//11
		System.out.println(x++);	//11
		System.out.println(x);		//23*/

		/*int x=5;
		int y=7;
		System.out.println(x && y);	//Error: bad operand*/

		//bitwise operators work at bit level	&-and, |-or, ^-x-or , <<-left shift, >>-rightshift, >>>-zero right shift, ~-negation
		/*int x=8;
		int y=10;
		System.out.println(x&y);	//8
		System.out.println(x|y);	//10
		System.out.println(x^y);	//2	
		System.out.println(x>>5);	//4	//shifts bits rightside by 5			
		System.out.println(y<<2);	//300	//shifts bits leftside by 2 */

		/*int x=10;
		System.out.println(~x);	//-11
		System.out.println(x>>2)	//2;
		System.out.println(x>>>2);	//2	*/

		//ternary operator ?: (if-then-else)
		/*int x=10,y=20;
		System.out.println((x<y)?x:y);	//10*/

	}
}
