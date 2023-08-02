package hu.eberimre.shipdraft.service;

import hu.eberimre.shipdraft.DTO.PersonData;
import hu.eberimre.shipdraft.DTO.RegistrationDataCommand;
import hu.eberimre.shipdraft.domain.Person;
import hu.eberimre.shipdraft.repository.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<PersonData> getAllPeople() {
        return personRepository.findAll().stream().map(PersonData::new).toList();
    }

    public void addPerson(RegistrationDataCommand personData) {
        Person person = new Person(personData);
        personRepository.save(person);
    }
}
