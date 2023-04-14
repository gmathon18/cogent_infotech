package question2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import question2.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
