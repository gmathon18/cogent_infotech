package cogent.infotech.com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="USER_TBL")
public class User {

	@Id
	private int id;
	private String userName;
	private String password;
	private String email;
}
