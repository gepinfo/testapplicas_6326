package com.geppetto.testapplicas.dao;

import com.geppetto.testapplicas.model.Person;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import java.util.Optional;

public interface PersonDao {

    Person createPerson(Person person);

    void deletePerson(String id);

    Page<Person> getAllPerson(Pageable pageable);

    Optional<Person> updatePerson(String id);

    Optional<Person> getPersonById(String id);

}

