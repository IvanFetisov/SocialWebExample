package com.example.darnford.Entities.Message;

import com.example.darnford.Entities.People.Person;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Primary;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public abstract class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NonNull
    private String text;

    @NonNull
    private Byte pricture;

    @NonNull
    @OneToOne
    private Person author;

}
