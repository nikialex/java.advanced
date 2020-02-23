package lecture10.homework.repository.artist;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "artists")
public class Artist {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String genre;
    private LocalDate dateOfBirth;


}
