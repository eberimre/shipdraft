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
    private String sex;
    private ContactData contactdata;

    public PersonData() {
    }

    public PersonData(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.yearOfBirth = person.getYearOfBirth();
        this.sex = person.getSex();
        this.contactdata = person.getContactdata();
    }

}
