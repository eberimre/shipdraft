package hu.eberimre.shipdraft.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "participant")
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @OneToOne
    @JoinColumn(name = "person_id")
    Person person;

    @ManyToOne
    @JoinColumn(name = "attendance_id")
    Attendance attendance;

    @Enumerated(EnumType.STRING)
    BoatType boatType;

    @Enumerated(EnumType.STRING)
    PositionType position;

    String questions;
    String remarks;

}
