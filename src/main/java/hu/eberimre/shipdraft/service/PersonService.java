package hu.eberimre.shipdraft.service;

import hu.eberimre.shipdraft.DTO.PersonData;
import hu.eberimre.shipdraft.DTO.RegistrationDataCommand;
import hu.eberimre.shipdraft.domain.Participant;
import hu.eberimre.shipdraft.domain.Person;
import hu.eberimre.shipdraft.repository.ParticipantRepository;
import hu.eberimre.shipdraft.repository.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PersonService {

    private final PersonRepository personRepository;
    private final ParticipantRepository participantRepository;

    public PersonService(PersonRepository personRepository, ParticipantRepository participantRepository) {
        this.personRepository = personRepository;
        this.participantRepository = participantRepository;
    }

    public List<PersonData> getAllPeople() {
        return personRepository.findAll().stream().map(PersonData::new).toList();
    }

    public void addPerson(RegistrationDataCommand personData) {
        Person person = new Person(personData);
        Participant participant = new Participant(person);
        personRepository.save(person);
        participantRepository.save(participant);
    }

    public void deletePerson(Integer id) {
        personRepository.deleteById(id);
        participantRepository.deleteByPerson_Id(id);
    }

    public PersonData getPerson(Integer id) {
        return new PersonData(personRepository.findById(id).orElseThrow());
    }
}
