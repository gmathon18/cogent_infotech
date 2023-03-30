package cogent.multithreading;

public class MyThread extends Thread{

	DisplayMessage dm;
	String name;
	
	public MyThread(DisplayMessage dm, String name) {
		
		this.dm = dm;
		this.name = name;
		
	}
	
	@Override
	public void run() {
		dm.sayHello(this.name);
	}
	
}
