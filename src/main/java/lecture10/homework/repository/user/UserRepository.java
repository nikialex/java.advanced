package lecture10.homework.repository.user;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findAll();

    User findById(int id);

}
