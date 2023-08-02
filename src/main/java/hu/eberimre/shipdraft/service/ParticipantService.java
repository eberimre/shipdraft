package hu.eberimre.shipdraft.service;

import hu.eberimre.shipdraft.DTO.ParticipantDataDetails;
import hu.eberimre.shipdraft.DTO.PersonData;
import hu.eberimre.shipdraft.domain.Participant;
import hu.eberimre.shipdraft.repository.ParticipantRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

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

}
