import java.util.*;

class Stack{
	int maxSize;
	int [] stackArr;
	int top = -1;
	Stack(int size){
		stackArr = new int[size];
		this.maxSize = size;
	}
	void push(int data){
		if(maxSize == top+1){
			System.out.println("Stack full");
			return;
		}
		top++;
		stackArr[top] = data;
	}
	int pop(){
		if(top == -1){
                        System.out.println("Stack is empty");
			return -1;
		}
		int val = stackArr[top];
		top--;
		return val;
	}
	boolean empty(){
		if(top == -1){
                        //System.out.println("Stack is empty");
			return true;
		}	
		return false;
	}
	int peak(){
		if(top == -1){
			System.out.println("Stack is empty");
			return -1;
		}
		return stackArr[top];
	}
	void printStack(){
		if(top == -1){
			System.out.println("Stack is empty");
		}
		else{	System.out.print("[ ");
			for(int i = 0;i<=top;i++){
				System.out.print(stackArr[i]+ "  ");
			}
			System.out.println(" ]");
		}
	}
	int size(){
		return top;
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of stackcyou wnat");
		int size = sc.nextInt();
		Stack s = new Stack(size);
		char repeat;
		do{
			System.out.println("Choose the operation you want to do from below \n");

			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.empty");
			System.out.println("4.peak");
			System.out.println("5.printStack");
			System.out.println("6.size");

			int choice = sc.nextInt();

			switch(choice){
			case 1: {
				int data = sc.nextInt();
				s.push(data);
				break;
			}
			case 2: {
				if(s.empty()==false){
                                	System.out.println(s.pop());
				}
                                break;
                        }
			case 3: {
                                System.out.println(s.empty());
                                break;
                        }
			case 4: {
				if(s.empty()==false){
                                	System.out.println(s.peak());
				}
                                break;
                        }
			case 5: {
                                s.printStack();
                                break;
                        }
			case 6: {
                                System.out.println(s.size()+1);
                                break;
                        }
			default : {
				System.out.println("Please chose from above options only");
			}
			}
			
			System.out.println("Do you want to continue !");
			repeat = sc.next().charAt(0);
		}while(repeat == 'y' || repeat =='Y');
	}
}
