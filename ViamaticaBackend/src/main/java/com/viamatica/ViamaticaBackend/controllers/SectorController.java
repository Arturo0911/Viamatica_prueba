package com.viamatica.ViamaticaBackend.controllers;

import com.viamatica.ViamaticaBackend.daos.SectorDao;
import com.viamatica.ViamaticaBackend.entities.Sector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/sector")
public class SectorController {

    @Autowired
    SectorDao sectorDao;

    @CrossOrigin("http://localhost:3000/Sector")
    @RequestMapping(value = "/getSectors", method = RequestMethod.GET)
    public List<Sector> getSectors(){
        return sectorDao.findAll();
    }

    @RequestMapping(value = "/saveSector", method = RequestMethod.POST)
    public Sector saveSector(@RequestBody @Valid Sector sector){
        return sectorDao.save(sector);
    }


}
