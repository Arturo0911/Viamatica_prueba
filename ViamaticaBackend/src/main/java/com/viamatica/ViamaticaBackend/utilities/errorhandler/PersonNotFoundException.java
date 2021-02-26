package com.viamatica.ViamaticaBackend.utilities.errorhandler;

public class PersonNotFoundException extends Exception {

    public PersonNotFoundException(String message){
        super(message);
    }
}
