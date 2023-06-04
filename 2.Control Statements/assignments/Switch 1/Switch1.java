/* Write a program in which students enter marks of 5 different subjects.if all subject having above passing marks add them and provide to switch case to print grades(first class,second class),if student get fail in any subject program shound print "You failed in exam"*/

import java.io.*;
class Switch1{

	public static void main(String [] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Phy : ");
		int phy = Integer.parseInt(br.readLine());

		System.out.print("Che : ");
		int che = Integer.parseInt(br.readLine());

		System.out.print("Math : ");
		int math = Integer.parseInt(br.readLine());

		System.out.print("Bio : ");
		int bio = Integer.parseInt(br.readLine());

		System.out.print("Eng : ");
		int eng = Integer.parseInt(br.readLine());

		int sum = phy + che + math + bio + eng;
		System.out.println("Your Total is : "+sum);

		switch(sum){

			case 300:
				System.out.println(" Distiction ");
				break;
			case 250:
				System.out.println(" First Class ");
				break;
			case 200:
				System.out.println("Second Class");
				break;
			case 150:
				System.out.println("Third Class ");
				break;
			default:
				System.out.println("Fail");
				break;
		}

	}
}