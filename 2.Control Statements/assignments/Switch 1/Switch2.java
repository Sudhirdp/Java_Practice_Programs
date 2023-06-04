/* Write a program which ask the user to enter a number from 0 to 5 and print  it's spelling if the entered number is greater than 5 print entered number is greater than 5         */

import java.io.*;
class SwitchDemo1{
	
	public static void main(String [] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter a number from 1 to 5 ");
		int num = Integer.parseInt(br.readLine());

		switch(num){

			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			default:
				System.out.println("Number is greater than 5");
				break;
		}
	}
}
