package cogent.infotech.assessment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ADMIN_TBL")
public class Admin {
	@Id
	private int id;
	private String adminName;
	private String password;
	private String email;

}
