package com.example.darnford.Entities.Message;

import com.example.darnford.Entities.People.Person;
import com.example.darnford.Entities.People.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class MessageToPerson extends Message{

    @NonNull
    @OneToOne
    @JoinColumn(name = "author_id")
    private Person author;

    @OneToOne
    @JoinColumn(name = "reciver_id")
    private Person reciver;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
