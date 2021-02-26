package com.viamatica.ViamaticaBackend.services;

import com.viamatica.ViamaticaBackend.entities.Person;

import java.util.List;

public interface PesonaService {

    //List<Person> findPersonByAge();
    List<Person> findAllPersons();
    void updatePerson(Person person);
    String deletePersonByCode(String personCode);

    Person savePerson(Person person);



}
