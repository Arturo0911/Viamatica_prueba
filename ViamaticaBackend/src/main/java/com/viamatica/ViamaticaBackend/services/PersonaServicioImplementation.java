package com.viamatica.ViamaticaBackend.services;


import com.viamatica.ViamaticaBackend.daos.PersonDao;
import com.viamatica.ViamaticaBackend.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServicioImplementation implements PesonaService {

    @Autowired
    PersonDao personDao;


    /*@Override
    public List<Person> findPersonByAge() {
        return personDao.findPersonOrderByAge();
    }*/

    @Override
    public List<Person> findAllPersons() {
        return personDao.findAll();
    }

    @Override
    public void updatePerson(Person person) {
        personDao.save(person);
    }

    @Override
    public String deletePersonByCode(String personCode) {
        personDao.deleteById(personCode);
        return "Person deleted";
    }

    @Override
    public Person savePerson(Person person) {
        return personDao.save(person);
    }
}
