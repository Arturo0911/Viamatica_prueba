package com.viamatica.ViamaticaBackend.utilities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
public class JsonResponseBody {

    @Getter @Setter
    private int server;

    @Getter @Setter
    private Object response;


}
