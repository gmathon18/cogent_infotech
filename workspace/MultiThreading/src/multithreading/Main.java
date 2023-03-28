package multithreading;

class aThread implements Runnable {

	@Override
	public void run() {
		for(int i =0; i<=10;i++) {
			System.out.println("i: "+i+"\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

public class Main {
	
	public static void main(String [] args) {
		
		aThread mt = new aThread();
		Thread th = new Thread(mt);
		th.start();
		
		for(int j =0; j<=10; j++) {
			System.out.println("j: "+j+"\t");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
}
