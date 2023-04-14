package pl.coderslab.logbook.student;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.coderslab.logbook.mark.Mark;
import pl.coderslab.logbook.parent.Parent;
import pl.coderslab.logbook.klasa.Klasa;

import java.util.List;

@Entity
@Setter
@Getter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    @OneToOne
    private Parent firstParent;
    @OneToOne
    private Parent secondParent;
    @ManyToOne
    private Klasa klasa;
    @OneToMany
    private List<Mark> marks;
}
