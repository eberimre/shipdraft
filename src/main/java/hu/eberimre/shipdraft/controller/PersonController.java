package hu.eberimre.shipdraft.controller;

import hu.eberimre.shipdraft.DTO.PersonData;
import hu.eberimre.shipdraft.DTO.RegistrationDataCommand;
import hu.eberimre.shipdraft.service.PersonService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public ResponseEntity <List<PersonData>> getAllPeople() {
        return new ResponseEntity<>(personService.getAllPeople(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> addPerson(@RequestBody RegistrationDataCommand personData) {
        personService.addPerson(personData);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity <PersonData> getPerson(@PathVariable Integer id) {
        return new ResponseEntity<>(personService.getPerson(id), HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable Integer id) {
        personService.deletePerson(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
