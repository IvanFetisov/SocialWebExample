package com.example.darnford.Services;


import com.example.darnford.Entities.People.Person;
import com.example.darnford.Entities.People.User;
import com.example.darnford.Entities.People.UserDTO;

public interface PersonService {

    public void registerPerson(Person person) throws Exception;

    public UserDTO UserToDto(Person person);

    public User updateUser(User user);


}
