package MongoDb.MongoDb;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Document
public class Student {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    @Indexed(unique = true)
    private String email;
    private Gender gender;
    private Address address;
    private List<String> favouriteSubjects;
    private BigDecimal totalSpendInBooks;
    private LocalDateTime created;

    public Student(String firstname,
                   String lastname,
                   String email,
                   Gender gender,
                   Address address,
                   List<String> favouriteSubjects,
                   BigDecimal totalSpendInBooks,
                   LocalDateTime created) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.favouriteSubjects = favouriteSubjects;
        this.totalSpendInBooks = totalSpendInBooks;
        this.created = created;
    }
}
