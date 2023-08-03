package hu.eberimre.shipdraft.service;

import hu.eberimre.shipdraft.DTO.*;
import hu.eberimre.shipdraft.domain.AccommodationType;
import hu.eberimre.shipdraft.domain.BoatType;
import hu.eberimre.shipdraft.domain.Participant;
import hu.eberimre.shipdraft.domain.PositionType;
import hu.eberimre.shipdraft.repository.ParticipantRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ParticipantService {

    private final ParticipantRepository participantRepository;


    public ParticipantService(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }

    public List<ParticipantDataDetails> getAllParticipants() {
        return participantRepository.findAll().stream().map(ParticipantDataDetails::new).toList();
    }

    public ParticipantDataDetails getParticipantData(Integer id) {
        return new ParticipantDataDetails(participantRepository.findByPerson_Id(id).orElseThrow());
    }

    public ParticipantDataDetails updateParticipant(ParticipantDataDetails participantDataDetails) {
        Participant participant = participantRepository.findById(participantDataDetails.getId()).orElseThrow();
        participant.setPerson(participantDataDetails.getPerson());
        participant.setAttendance(participantDataDetails.getAttendance());
        participantRepository.save(participant);
        return participantDataDetails;
    }


    public List<AccommodationTypeOption> getAllAccommodationType() {
        List<AccommodationType>  accommodationTypes = Arrays.asList(AccommodationType.values());
        return accommodationTypes.stream().map(AccommodationTypeOption::new).toList();
    }

    public List<BoatTypeOption> getAllBoatTypeOptions() {
        List<BoatType>  boatTypes = Arrays.asList(BoatType.values());
        return boatTypes.stream().map(BoatTypeOption::new).toList();
    }

    public List<PositionTypeOption> getAllPositionTypeOptions() {
        List<PositionType>  positionTypes = Arrays.asList(PositionType.values());
        return positionTypes.stream().map(PositionTypeOption::new).toList();
    }

}
