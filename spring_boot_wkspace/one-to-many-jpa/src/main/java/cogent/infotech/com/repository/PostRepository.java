package cogent.infotech.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.infotech.com.entity.Post;

public interface PostRepository extends JpaRepository<Post,Long>{

}
