package hu.eberimre.shipdraft.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDataDetails {

    private Integer id;
    private String email;
    private String phone;

    public ContactDataDetails() {
    }

    public ContactDataDetails(Integer id, String email, String phone) {
        this.id = id;
        this.email = email;
        this.phone = phone;
    }
}
