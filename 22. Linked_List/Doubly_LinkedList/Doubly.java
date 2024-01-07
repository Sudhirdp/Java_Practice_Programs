import java.util.*;

class Node{
	Node prev = null;
	Node next = null;
	int data;
	Node(int data){
		this.data = data;
	}
}
class DoublyLinkedList{
	Node head = null;
	//addFirst
	void addFirst(int data){
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else{
			newNode.next = head;
			head = newNode;
		}

	}
	//addLast
	void addLast(int data){
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else{
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			newNode.prev = temp;
			temp.next = newNode;
		}
	}
	//addAtPos
	void addAtPos(int pos,int data){
		if(pos<=0 || pos >=countNodes()+2){
			System.out.println("Enter the valid position :");
		}
		else if(pos == 1){
			addFirst(data);
		}
		else if(pos == countNodes()+1){
			addLast(data);
		}
		else{
			Node newNode = new Node(data);
			Node temp = head;
			while(pos-2 != 0){
				pos--;
				temp = temp.next;
			}
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next.prev = newNode;
			temp.next = newNode;
		}

	}
	//delFirst
	void delFirst(){
		if(head == null)
			System.out.println("List is empty");
		else if(head.next == null){
			head = null;
		}
		else{
			head = head.next;
			head.prev.next = null;
			head.prev = null;
		}
	}
	//delLast
	void delLast(){
		if(head == null)
			System.out.println("it is a empty List");
		else{
			Node temp = head;
			while(temp.next.next!=null){
				temp=temp.next;
			}
			temp.next.prev = null;
			temp.next = null;
		}
	}
	//delAtPos
	void delAtPos(int pos){
		if(pos <=0 || pos>countNodes())
			System.out.println("Enter the proper value");
		else if(pos == 1)
			delFirst();
		else if(pos == countNodes())
			delLast();
		else{
			Node temp = head;
			while(pos-2!=0){
				temp = temp.next;
				pos--;
			}
			temp.next.next.prev=temp;
			temp.next = temp.next.next;
		}
	}
	//countNodes
	int countNodes(){
		Node temp = head;
		int count = 0;
		while(temp!=null){
			count++;
			temp = temp.next;
		}
		return count;

	}
	//printdll
	void printdll(){
		Node temp = head;
		if(temp == null){
			System.out.println("List is empty ");
			return;
		}
		while(temp!=null){
			System.out.print(temp.data  +"\t");
			temp = temp.next;
		}
		System.out.println();
	}
}
class Client{
	public static void main(String [] args){
		DoublyLinkedList ll = new DoublyLinkedList();

		Scanner sc = new Scanner(System.in);

		char ch = 'y';
		do{
			System.out.println("1.addFirst");
			System.out.println("2.addLast");
			System.out.println("3.addAtPos");
			System.out.println("4.delFirst");
			System.out.println("5.delLast");
			System.out.println("6.delAtPos");
			System.out.println("7.countNodes");
			System.out.println("8.printdll");

			System.out.println("Choose the expresion you want to perform from above :");
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
	
					System.out.println("Enter the position");
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
					System.out.println("Enter the position");
					int pos = sc.nextInt();
					ll.delAtPos(pos);
					break;
				}
				case 7:{
					System.out.println(ll.countNodes());
					break;
				}
				case 8:{
					ll.printdll();
				}
				default:{
					System.out.println("Enter from above data numbers only");
					break;
				}

			}
			System.out.println("Do you want to continue ");
			ch = sc.next().charAt(0);
		}while(ch!='y' || ch!='Y');
	}
}
