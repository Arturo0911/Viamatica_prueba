package com.viamatica.ViamaticaBackend.controllers;

import com.viamatica.ViamaticaBackend.daos.SectorDao;
import com.viamatica.ViamaticaBackend.entities.Sector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/sector")
public class SectorController {

    @Autowired
    SectorDao sectorDao;


    @RequestMapping(value = "/getSectors", method = RequestMethod.GET)
    public List<Sector> getSectors(){
        return sectorDao.findAll();
    }

    @RequestMapping(value = "/saveSector", method = RequestMethod.POST)
    public Sector saveSector(@RequestBody @Valid Sector sector){
        return sectorDao.save(sector);
    }


}
