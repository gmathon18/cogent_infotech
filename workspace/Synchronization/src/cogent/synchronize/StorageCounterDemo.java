package cogent.synchronize;

public class StorageCounterDemo  {
	
	public static void main(String [] args) {
	
	Storage ourStorage = new Storage();
	Counter c = new Counter(ourStorage);
	Printer p = new Printer(ourStorage);

	c.start();
	p.start();

}
}
