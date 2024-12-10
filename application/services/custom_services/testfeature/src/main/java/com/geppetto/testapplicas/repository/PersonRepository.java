package com.geppetto.testapplicas.repository;

import com.geppetto.testapplicas.model.Person;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PersonRepository extends JpaRepository<Person, String>  {
    
    Page<Person> findAll(Pageable pageable);

}