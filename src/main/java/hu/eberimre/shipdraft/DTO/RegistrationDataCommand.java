package hu.eberimre.shipdraft.DTO;

import hu.eberimre.shipdraft.domain.ContactData;
import hu.eberimre.shipdraft.domain.Person;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationDataCommand {

    private String name;
    private int yearOfBirth;
    private String gender;


    public RegistrationDataCommand() {
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getGender() {
        return gender;
    }
}
