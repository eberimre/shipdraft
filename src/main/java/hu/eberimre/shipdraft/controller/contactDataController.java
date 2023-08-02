package hu.eberimre.shipdraft.controller;

import hu.eberimre.shipdraft.service.ContactDataService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contactdata")
public class contactDataController {
    private final ContactDataService contactDataService;

    public contactDataController(ContactDataService contactDataService) {
        this.contactDataService = contactDataService;
    }
}
