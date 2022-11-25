package com.example.darnford.Services;

import com.example.darnford.Entities.People.Person;
import com.example.darnford.Entities.People.User;
import com.example.darnford.Entities.People.UserDTO;
import com.example.darnford.Repositories.PersonRepository;

public class PersonServiceImpl implements PersonService{

    PersonRepository repository;

    @Override
    public void registerPerson(Person person) throws Exception {
     if (person.getName().isEmpty() && person.getName()== null)
         throw new Exception("Exception message from registerPerson method");
     else{
         repository.saveAndFlush(person);
     }
    }

    @Override
    public UserDTO UserToDto(Person person) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(person.getName());
        userDTO.setSurname(person.getSurname());
        userDTO.setPicture(person.getPicture());
        userDTO.setFatherName(person.getFatherName());
        return userDTO;
    }

    @Override
    public User updateUser(User user) {
        return user ;
    }
}
