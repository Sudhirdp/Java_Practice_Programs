// Two Stacks

import java.util.*;


class TwoStacks{

	int []stackArr;
	int maxsize;
	int top1;
	int top2;
	TwoStacks(int size){
		this.stackArr = new int[size];
		maxsize = size;
		this.top1 = -1;
		this.top2 = size;
	}

	void push1(int data){
		if(top2-top1>1){
			top1++;
			stackArr[top1] = data; 
		}
		else{
			System.out.println("Stack is full");
		}
	}
	void push2(int data){
		if(top2-top1>1){
			top2--;
			stackArr[top2] = data;
		}
		else{
			System.out.println("Stack is full");
		}
	}
	int pop1(){
		if(top1!=-1){
			int val = stackArr[top1];
			top1--;
			return val;
		}	
		else{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	int pop2(){
		if(top2 != maxsize){
			int val = stackArr[top2];
			top2++;
			return val;
		}
		else{
			System.out.println("Stack is empty");
			return -1;
		}
	}
}

class Client{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size = sc.nextInt();

		TwoStacks ts = new TwoStacks(size);

		char ch = 'a';

		do{
			System.out.println("1. push : 1");
			System.out.println("2. push : 2");
			System.out.println("3. pop : 1");
			System.out.println("4. pop : 2");

			System.out.println("Enter your choice : ");

			int choice = sc.nextInt();

			switch (choice){
				case 1 : {
					System.out.println("Enter element for stack 1 ");
					ts.push1(sc.nextInt());
					break;
				}
				case 2 : {
                                        System.out.println("Enter element for stack 2 ");
                                        ts.push2(sc.nextInt());
					break;
                                }
				case 3 : {
                                        int ret = ts.pop1();
					if(ret != -1){
						System.out.println(ret  +"poped from stack 1 ");
					}
					break;
                                }
				case 4 : {
                                        int ret = ts.pop2();
                                        if(ret != -1){
                                                System.out.println(ret  +"poped from stack 2 ");
                                        }
					break;
                                }
				default : {
					System.out.println("wrong input ");
					break;
				}
			}

			System.out.println("Do you want to continue ");

			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}
}
