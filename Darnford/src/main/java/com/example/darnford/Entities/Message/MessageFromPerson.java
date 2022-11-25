package com.example.darnford.Entities.Message;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MessageFromPerson extends Message{

    @Id
    private Long id;

}
