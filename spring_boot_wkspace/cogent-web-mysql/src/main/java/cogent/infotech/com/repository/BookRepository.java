package cogent.infotech.com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cogent.infotech.com.entity.Book;
import cogent.infotech.com.entity.User;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

	User findByUserName(String username);

}
