package hu.eberimre.shipdraft.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class AttendanceDataDetails {

    private Integer id;
    private LocalDate arrivalDate;
    private LocalTime arrivalTime;
    private LocalDate leavingDate;

    public AttendanceDataDetails() {
    }

    public AttendanceDataDetails(Integer id, LocalDate arrivalDate, LocalTime arrivalTime, LocalDate leavingDate) {
        this.id = id;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.leavingDate = leavingDate;
    }
}
