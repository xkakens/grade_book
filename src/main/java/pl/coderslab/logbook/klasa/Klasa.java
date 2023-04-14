package pl.coderslab.logbook.klasa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.coderslab.logbook.teacher.Teacher;

@Entity
@Getter
@Setter
public class Klasa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    private Teacher tutor;

}
