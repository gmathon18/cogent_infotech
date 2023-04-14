package cogent.infotech.com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
