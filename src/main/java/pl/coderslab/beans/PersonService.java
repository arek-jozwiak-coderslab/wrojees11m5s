package pl.coderslab.beans;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person getPersonById(long id) {
        return personRepository.getPersonById(id);
    }
}
