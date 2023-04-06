package cogent.infotech.com.lc;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		
		return "Patient[id=" + id +"]";
		
	}
	
	public void init()
	{
		System.out.println("Here write code to reserve resources like create DB Connection, calling REST api, etc");
	}
	
	public void destroy()
	{
		System.out.println("Here write the code to clean up the resources");
	}
}
