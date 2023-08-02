package hu.eberimre.shipdraft.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    String name;
    int yearOfBirth;
    String sex;
    @OneToOne(cascade = CascadeType.ALL)
    ContactData contactdata;

}
