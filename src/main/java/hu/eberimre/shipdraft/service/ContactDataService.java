package hu.eberimre.shipdraft.service;

import hu.eberimre.shipdraft.repository.ContactDataRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ContactDataService {

    private final ContactDataRepository contactDataRepository;

    public ContactDataService(ContactDataRepository contactDataRepository) {
        this.contactDataRepository = contactDataRepository;
    }
}
