package lecture10.homework.repository.song;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "songs")
public class Song {

    @Id
    private int id;
    private String name;
    @Column(name = "duration_in_seconds")
    private int durationInSec;
    private LocalDate dateOfSongCreation;
    @Column(name = "fk_artist_id")
    private int artistId;
}
