/* Take choice from user show this to user   
 *	What's your interest ?
 *	1. Movies
 *	2. Series
 *
 *	if 1                                      if 2
 *	1.Founder				  1.Silicon valley
 *	2.Snowden				  2.Devs
 *	3.Jobs					  3.the IT crowd
 *	4.Her					  4.Mr. Robot
 *	5.Social Network
 *	6.Wall-E
 *	7.AI
 * */

import java.io.*;
class Switch2{

	public static void main(String [] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("one for movies 2 for series ?");
		int i = Integer.parseInt(br.readLine());

		switch(i){

			case 1:{
				System.out.print("Enter Your Choice : ");
			      int movie = Integer.parseInt(br.readLine());
			      switch(movie){
							
				case 1:
					System.out.println("Founder");
					break;

				case 2:
					System.out.println("Snowden");
					break;

				case 3:
					System.out.println("Jobs");
						break;

				case 4:
					System.out.println("Her");
					break;

				case 5:
					System.out.println("Social Network");
					break;

				case 6:
					System.out.println("Wall-E");
					break;

				case 7:
					System.out.println("AI");
					break;

				default:
					System.out.println("Invalid Input");
					break;
				}
			}
			break;

			case 2:{
				System.out.print("Enter Your Choice : ");
				int series = Integer.parseInt(br.readLine());
			      switch(series){
						case 1:
							System.out.println("Silicon Valley");
							break;
						case 2:
							System.out.println("Devs");
							break;
						case 3:
							System.out.println("the IT crowd");
							break;
						case 4:
							System.out.println("Mr. Robot");
							break;
						default:
							System.out.println("Invalid Input");
							break;
			      }
			}
			break;

			default :
				System.out.println("Invalid Input");
				break;
		}
	}
}