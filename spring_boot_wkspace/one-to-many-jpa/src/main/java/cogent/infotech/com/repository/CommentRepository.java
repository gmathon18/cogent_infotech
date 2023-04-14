package cogent.infotech.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.infotech.com.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
