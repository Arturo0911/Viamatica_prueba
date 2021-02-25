package com.viamatica.ViamaticaBackend.controllers;


import com.viamatica.ViamaticaBackend.daos.PersonDao;
import com.viamatica.ViamaticaBackend.entities.Person;
import com.viamatica.ViamaticaBackend.services.PesonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {


    @Autowired
    PersonDao personDao;

    @Autowired
    PesonaService personaService;


    @RequestMapping("/personas")
    public List<Person> showPersons(){
        return personaService.findAllPersons();
    }

    @RequestMapping(value = "/insertPersons", method = RequestMethod.POST)
    public Person insertPerson(@RequestBody @Valid Person person){
        //person.getSector().getSectorCode();
        return personDao.save(person);
    }

    @RequestMapping("/personasAge")
    public  List<Person> findPersonsAge(){
        return personaService.findPersonByAge();
    }

}
