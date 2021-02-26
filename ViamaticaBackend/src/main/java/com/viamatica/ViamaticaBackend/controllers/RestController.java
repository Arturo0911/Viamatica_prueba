package com.viamatica.ViamaticaBackend.controllers;


import com.viamatica.ViamaticaBackend.daos.PersonDao;
import com.viamatica.ViamaticaBackend.entities.Person;
import com.viamatica.ViamaticaBackend.services.PesonaService;
import com.viamatica.ViamaticaBackend.utilities.JsonResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Arturo Negreiros Samanez
 */

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {

    @Autowired
    PersonDao personDao;

    @Autowired
    PesonaService personaService;


    @RequestMapping(value = "/personas", method = RequestMethod.GET)
    ResponseEntity<JsonResponseBody> findPersons(){
        return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(), personaService.findAllPersons()));
    }


    @RequestMapping(value = "/insertPersons", method = RequestMethod.POST)
    ResponseEntity<JsonResponseBody> newPerson(@RequestBody @Valid Person person){
        return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(), personaService.savePerson(person)));
    }

    @RequestMapping(value = "/updatePerson", method = RequestMethod.POST)
    ResponseEntity<JsonResponseBody> updatePerson(@RequestBody @Valid Person person){
        return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(), personaService.savePerson(person)));
    }

    @DeleteMapping("/deletePerson")
    ResponseEntity<JsonResponseBody> deletePerson(@RequestBody @Valid Person person){

        try {
            //personaService.deletePersonByCode(personCode);
            personDao.delete(person);
            return ResponseEntity.status(HttpStatus.OK).body(new JsonResponseBody(HttpStatus.OK.value(),"ok, Persona eliminada"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new JsonResponseBody(HttpStatus.BAD_REQUEST.value(), e.toString()));
        }
    }

}
