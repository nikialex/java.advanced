package lecture9.homework.repository.artist;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Artist {

    private int id;
    private String firstName;
    private String lastName;
    private String genre;
    private LocalDate dateOfBirth;


}
