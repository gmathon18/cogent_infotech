package cogent.infotech.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.infotech.assessment.entity.User;


public interface UserRepository extends JpaRepository<User,Integer>{

	
	public User findByUserName(String name);
}
