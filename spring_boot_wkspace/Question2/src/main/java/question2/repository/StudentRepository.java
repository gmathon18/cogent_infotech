package question2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import question2.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
