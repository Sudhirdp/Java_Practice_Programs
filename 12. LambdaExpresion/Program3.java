//Lambda function with Punnable Interface 
//Runnable inteface has only one abstract method which is run();
//this is used to make new thread 
//i.e we can use this lambda function to create new thread using single class 


class ThreadDemo{
	public static void main(String []a ){
		Runnable obj1 = new Runnable(){
			public void run(){
				System.out.println(Thread.currentThread().getName());
			}
		};
		Thread t1 = new Thread(obj1);
		t1.start();

		Runnable obj2 = ()-> System.out.println(Thread.currentThread().getName());

		Thread t2 = new Thread(obj2);
		t2.start();

	}
}

