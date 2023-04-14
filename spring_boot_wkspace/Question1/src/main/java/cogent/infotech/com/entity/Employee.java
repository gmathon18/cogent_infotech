package cogent.infotech.com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "employee")
public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String name;
		private String email;
		@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name="up_id")
		private Passport passport;
		
		public Employee() {
			
		}

		public Employee(long id, String name, String email, Passport passport) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.passport = passport;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Passport getPassport() {
			return passport;
		}

		public void setPassport(Passport passport) {
			this.passport = passport;
		}
		
}
