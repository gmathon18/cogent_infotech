package cogent.synchronize;

public class Storage {

	int i;
	boolean valueSet = false;
	
	public synchronized void setI(int i) {
		while (valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		this.i = i;
		valueSet = true;
		System.out.println("Produced: " + i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		notify();
	}
	
	public synchronized int getI() {
		while (!valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		System.out.println("Consummed:" + i);
		valueSet = false;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		notify();
		return i;
	}
}
