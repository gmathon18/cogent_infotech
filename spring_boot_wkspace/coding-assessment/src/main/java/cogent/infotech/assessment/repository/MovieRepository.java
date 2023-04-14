package cogent.infotech.assessment.repository;

import org.springframework.stereotype.Repository;

import cogent.infotech.assessment.entity.Movie;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
