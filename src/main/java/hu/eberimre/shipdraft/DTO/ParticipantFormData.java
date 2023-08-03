package hu.eberimre.shipdraft.DTO;

import hu.eberimre.shipdraft.domain.PositionType;

import java.util.List;

public class ParticipantFormData {

    private List<AccommodationTypeOption> accommodationTypeOptions;
    private List<BoatTypeOption> boatTypeOptions;
    private List<PositionTypeOption> positionTypeOptions;

    public ParticipantFormData(List<AccommodationTypeOption> accommodationTypeOptions,
                               List<BoatTypeOption> boatTypeOptions,
                               List<PositionTypeOption> positionTypeOptions) {
        this.accommodationTypeOptions = accommodationTypeOptions;
        this.boatTypeOptions = boatTypeOptions;
        this.positionTypeOptions = positionTypeOptions;
    }

    public List<AccommodationTypeOption> getAccommodationTypeOptions() {
        return accommodationTypeOptions;
    }

    public void setAccommodationTypeOptions(List<AccommodationTypeOption> accommodationTypeOptions) {
        this.accommodationTypeOptions = accommodationTypeOptions;
    }

    public List<BoatTypeOption> getBoatTypeOptions() {
        return boatTypeOptions;
    }

    public void setBoatTypeOptions(List<BoatTypeOption> boatTypeOptions) {
        this.boatTypeOptions = boatTypeOptions;
    }

    public List<PositionTypeOption> getPositionTypeOptions() {
        return positionTypeOptions;
    }

    public void setPositionTypeOptions(List<PositionTypeOption> positionTypeOptions) {
        this.positionTypeOptions = positionTypeOptions;
    }
}
