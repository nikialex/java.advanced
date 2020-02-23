package lecture10.homework.repository.song;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface SongRepository extends CrudRepository<Song, Integer> {

    List<Song> findAll();

    Song findById(int id);
}
