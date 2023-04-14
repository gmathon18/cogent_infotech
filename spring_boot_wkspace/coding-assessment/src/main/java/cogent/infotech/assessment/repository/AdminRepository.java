package cogent.infotech.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.infotech.assessment.entity.Admin;


public interface AdminRepository extends JpaRepository<Admin,Integer> {

}
