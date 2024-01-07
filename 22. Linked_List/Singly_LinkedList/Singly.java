import java.util.*;

class Node{
	Node next = null;
	int data;
	Node(int data){
		this.data = data;
	}
}
class SinglyLinkedList{
	Node head = null;
	//addFirst
	void addFirst(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		else{
			newNode.next = head;
			head = newNode;
		}
	}
	//addLast
	void addLast(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		else{
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	//addAtPos
	void addAtPos(int pos,int data){
		if(pos<=0 || pos>nodeCount()+1){
			System.out.println("Please enter a valid position ");
		}
		else if(pos == 1)
			addFirst(data);
		else if(pos == nodeCount()+1){
			addLast(data);
		}
		else{
			Node newNode = new Node(data);
			Node temp = head;
			while(pos-2!=0){
				temp = temp.next;
				pos--;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	//delFirst
	void delFirst(){
		if(head == null){
			System.out.println("Empty List");
			return;
		}
		/*else if(head.next==null){
			head = null;
		}*/
		else{
			head = head.next;
		}
	}
	//delLast
	void delLast(){
		if(head == null)
			System.out.println("Empty List");
		else{
			Node temp = head;
			while(temp.next.next!=null){
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	//delAtPos
	void delAtPos(int pos){
		if(pos <=0 || pos >nodeCount())
			System.out.println("Position does not exists");
		else if(pos==1){
			delFirst();
		}
		else if(pos == nodeCount()){
			delLast();
		}
		else{
			Node temp = head;
			while(pos-2!=0){
				temp = temp.next;
				pos--;
			}
			temp.next = temp.next.next;
		}
	
	}
	//countNode
	int nodeCount(){
		int count = 0;
		Node temp = head;
		while(temp!=null){
			count++;
			temp = temp.next;
		}
		return count;
	}
	//printsll
	void printsll(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
class Client{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);

		SinglyLinkedList ll = new SinglyLinkedList();

		char ch;
		do{
			System.out.println("1.addFirst");
			System.out.println("2.addLast");
			System.out.println("3.addAtPos");
			System.out.println("4.delFirst");
			System.out.println("5.delLast");
			System.out.println("6.delAtPos");
			System.out.println("7.countNode");
			System.out.println("8.printsll");

			System.out.println();
			System.out.println("Enter your operation from above choice");
			int x = sc.nextInt();

			switch(x){
				case 1:{
					System.out.println("Enter the data ");
                        		int data = sc.nextInt();
					
					ll.addFirst(data);
					
					break;
				}
				case 2:{
					System.out.println("Enter the data ");
                        		int data = sc.nextInt();
					
					ll.addLast(data);
					break;
				}
				case 3:{
					System.out.println("Enter the data ");
                        		int data = sc.nextInt();
					
					System.out.println("Enter the position : ");
					int pos = sc.nextInt();
					
					ll.addAtPos(pos,data);
					break;
				}
				case 4:{
					ll.delFirst();
					break;
				}
				case 5:{
					ll.delLast();
					break;
				}
				case 6:{
					System.out.println("Enter the position : ");
                                        int pos = sc.nextInt();

					ll.delAtPos(pos);
					break;
				}
				case 7:
					ll.nodeCount();
					break;
				case 8:
					ll.printsll();
					break;
				default:
					System.out.println("Please enter from above given choice only");
					break;

			}
			System.out.println("Do you want to continue ");
			ch = sc.next().charAt(0);

		}while(ch!='y' || ch!='Y');
	}
}
