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
    private Integer id;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @ManyToOne
    @JoinColumn(name = "attendance_id")
    private Attendance attendance;

    @Enumerated(EnumType.STRING)
    private BoatType boatType;

    @Enumerated(EnumType.STRING)
    private PositionType position;

    @Enumerated(EnumType.STRING)
    private AccommodationType accommodationType;

    private String questions;
    private String remarks;

}
