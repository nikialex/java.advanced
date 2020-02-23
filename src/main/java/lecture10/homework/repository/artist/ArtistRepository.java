package lecture10.homework.repository.artist;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public interface ArtistRepository extends CrudRepository<Artist, Integer> {

    List<Artist> findAll();

    Artist findById(int id);

}
