package multithreading;

class MyThread extends Thread implements Runnable {
	
	int id;
	
	public MyThread(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		for(int i =0; i<=10;i++) {
			System.out.println("Thread " + this.id + ": "+i+"\t");
			
		}
	}
}

public class ThreadDemo{

	public static void main(String [] args) {
		
		MyThread threadOne = new MyThread(1);
		MyThread threadTwo = new MyThread(2);
		
		Thread th = new Thread(threadOne);
		Thread th2 = new Thread(threadTwo);

		th.setPriority(Thread.MAX_PRIORITY);
		th2.setPriority(Thread.MIN_PRIORITY);
		
		th.start();
		th2.start();
		
		
	}
}
