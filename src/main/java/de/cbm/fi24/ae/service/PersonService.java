package de.cbm.fi24.ae.service;

import de.cbm.fi24.ae.model.Person;
import de.cbm.fi24.ae.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElse(null);
    }


}
