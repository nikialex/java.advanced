package lecture10.homework.repository.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private boolean isPaid;

}
