package hu.eberimre.shipdraft.DTO;

import hu.eberimre.shipdraft.domain.ContactData;
import hu.eberimre.shipdraft.domain.Person;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonData {

    private Integer id;
    private String name;
    private int yearOfBirth;
    private String gender;
    private ContactData contactData;
    private Boolean isParticipate;

    public PersonData() {
    }

    public PersonData(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.yearOfBirth = person.getYearOfBirth();
        this.gender = person.getGender();
        this.contactData = person.getContactData();
        this.isParticipate = person.getIsParticipate();
    }

}
