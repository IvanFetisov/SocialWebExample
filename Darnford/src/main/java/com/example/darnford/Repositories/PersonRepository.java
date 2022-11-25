package com.example.darnford.Repositories;

import com.example.darnford.Entities.People.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person,Long> {
Optional<? extends Person> findById(Long id);
}
