package com.example.darnford.Entities.People;

import com.example.darnford.Entities.Message.Message;
import com.example.darnford.Entities.Message.MessageToPerson;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User extends Person {


    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<MessageToPerson> sendedMessages;

}
