class Rectangle{
	 
	int length;
	int breadth;

	public Rectangle() {
		
		length=0;
		breadth =0;
	
	}
	
	public Rectangle(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
		
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int calcArea() {
		
		return this.breadth * this.length;
				
	}
	
	public void display() {
		
		System.out.println("The length of the rectangle is "+this.length);
		System.out.println("The breath of the rectangle is "+this.breadth);
		System.out.println("The area of the rectangle is "+ calcArea());
	}
}


