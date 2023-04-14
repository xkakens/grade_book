package pl.coderslab.logbook.mark;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.coderslab.logbook.student.Student;

@Entity
@Getter
@Setter
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int importance;
    private int value;
    private String description;
}
