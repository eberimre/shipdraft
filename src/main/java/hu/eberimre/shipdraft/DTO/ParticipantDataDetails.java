package hu.eberimre.shipdraft.DTO;

import hu.eberimre.shipdraft.domain.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParticipantDataDetails {

    private Integer id;
    private Person person;
    private Attendance attendance;
    private String boatType;
    private String position;
    private String questions;
    private String remarks;
    private String accommodationType;

    public ParticipantDataDetails() {
    }

    public ParticipantDataDetails(Participant participant) {
        this.id = participant.getId();
        this.person = participant.getPerson();
        this.attendance = participant.getAttendance();
        this.boatType = String.valueOf(participant.getBoatType());
        this.position = String.valueOf(participant.getPosition());
        this.questions = participant.getQuestions();
        this.remarks = participant.getRemarks();
        this.accommodationType = String.valueOf(participant.getAccommodationType());
    }
}
