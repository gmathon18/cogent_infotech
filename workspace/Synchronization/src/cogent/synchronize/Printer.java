package cogent.synchronize;

public class Printer extends Thread{
	
	Storage st;
	
	public Printer(Storage st) {
		this.st  = st;
		
	}
	
	@Override
	public void run() {
		System.out.println("Printer thread is printing....");
		
		synchronized(this) {
			for(int i=0; i<=10;i++) {
				
				this.st.getI();
				
			}
		
		}
	}
}
