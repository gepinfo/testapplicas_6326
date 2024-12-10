package com.geppetto.testapplicas.repository;

import com.geppetto.testapplicas.model.User;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, String>  {
    
    Page<User> findAll(Pageable pageable);

}