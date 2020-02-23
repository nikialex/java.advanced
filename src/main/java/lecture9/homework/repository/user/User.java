package homework.repository.user;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private boolean isPaid;

}
