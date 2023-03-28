package multithreading;

class OurThread extends Thread {

	OurThread(){
		super("Demo Thread");
		System.out.println("the child thread: "+this);
		start();
	}
	
	@Override
	public void run() {
		for (int i=5; i>0;i--) {
			System.out.println("Child thread "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Exiting child thread");
	}
}

public class OurMain {
	
	public static void main(String [] args) {
		
		new OurThread();
		for(int i = 5; i>0; i--) {
			
			System.out.println("Main thread "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}
		System.out.println("main thread exiting");
}
}
