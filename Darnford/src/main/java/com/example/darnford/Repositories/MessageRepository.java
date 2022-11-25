package com.example.darnford.Repositories;

import com.example.darnford.Entities.Message.Message;
import com.example.darnford.Entities.Message.MessageFromPerson;
import com.example.darnford.Entities.Message.MessageToPerson;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Locale;
import java.util.Optional;

public interface MessageRepository extends JpaRepository<  Message, Long> {

    Optional<? extends Message> findByAuthor(String author_name);

    Optional<? extends Message > findAllByAuthor_Name(String author_name);

    Optional<? extends MessageToPerson> findById(Long id);

    Optional<? extends MessageFromPerson> findMessageFromPersonById(Long id);

}
