package hu.eberimre.shipdraft.domain;

import hu.eberimre.shipdraft.DTO.RegistrationDataCommand;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@Data
@RequiredArgsConstructor
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String name;
    private int yearOfBirth;
    private String gender;
    private Boolean isParticipate;
    @OneToOne(cascade = CascadeType.ALL)
    private ContactData contactData;

    public Person(RegistrationDataCommand registrationDataCommand) {
        this.name = registrationDataCommand.getName();
        this.yearOfBirth = registrationDataCommand.getYearOfBirth();
        this.gender = registrationDataCommand.getGender();
        this.isParticipate = false;
    }
}
