package cogent.synchronize;

public class Counter extends Thread {

	Storage st;
	
	public Counter(Storage st) {
		this.st  = st;
		}
	
	@Override
	public void run() {
		System.out.println("Counter thread is counting....");
		
		synchronized(this) {
			for(int i=0; i<=10;i++) {
				
				this.st.setI(i);
				
			}
		
		}
	}
}
