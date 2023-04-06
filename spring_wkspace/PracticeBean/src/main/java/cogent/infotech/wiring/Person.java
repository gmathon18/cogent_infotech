package cogent.infotech.wiring;

public class Person {

		Car car;
		Address add;
		
		
		
		/* THIS IS FOR CONSTRUCTOR WIRING 
		public Person(Car car, Address add) {
			super();
			this.car = car;
			this.add = add;
		}
		
		*/
		
		public Car getCar() {
			return car;
		}
		
		/*
		 * WE DO NOT HAVE SET METHODS FOR CONSTRUCTOR WIRING
		 */
		public void setCar(Car car) {
			this.car = car;
		}
		
		
		public Address getAdd() {
			return add;
		}
		
		/*
		 * WE DO NOT HAVE SET METHODS FOR CONSTRUCTOR WIRING
		 */
		public void setAdd(Address add) {
			this.add = add;
		}
		
		
}
