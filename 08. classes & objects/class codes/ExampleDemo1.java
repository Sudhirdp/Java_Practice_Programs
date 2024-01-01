class Ticket{
	int fare=1000;
	String ticketClass="Ecomomy";

	static int arrivalTime=10;

	void breakFast(){
		System.out.println(fare+" is fare for "+ticketClass+" class and flight arrives at: "+arrivalTime);
	}

	static void takeOff(){
		//System.out.println(fare);	// non-static variable fare cannot be referenced from a static context
		System.out.println("Announcing Arrival time "+arrivalTime);
	}

	/*public static void main(String args[]){
		Ticket tc=new Ticket();

		tc.breakFast();
	}*/
}
class User{
	public static void main(String args[]){
		
		Ticket user1=new Ticket();
		Ticket user2=new Ticket();

		user1.breakFast();	//1000	Economy	10
		user1.takeOff();	//10

		user2.breakFast();	//1000	Economy	10
		user2.takeOff();	//10

		Ticket.takeOff();	//10
		System.out.println(Ticket.arrivalTime);	//10

		System.out.println("Making changes , after changes: ");

		user1.fare=2000;
		user1.ticketClass="Business";
		user1.arrivalTime=12;

                user1.breakFast();      //1000  Economy 10
                user1.takeOff();        //10

                user2.breakFast();      //1000  Economy 10
                user2.takeOff();        //10

                Ticket.takeOff();       //10
                System.out.println("Arrival time for everyone will be: "+Ticket.arrivalTime); //10

	}
}
