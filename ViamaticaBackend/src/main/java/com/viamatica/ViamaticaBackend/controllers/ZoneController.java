package com.viamatica.ViamaticaBackend.controllers;


import com.viamatica.ViamaticaBackend.daos.ZoneDao;
import com.viamatica.ViamaticaBackend.entities.Zone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/zone")
public class ZoneController {

    @Autowired
    ZoneDao zoneDao;

    @RequestMapping("/getZones")
    public List<Zone> getZones(){
        return  zoneDao.findAll();
    }


    @RequestMapping(value = "/saveZone", method = RequestMethod.POST)
    public Zone saveZone(@RequestBody @Valid Zone zone){
        zoneDao.save(zone);
        return zone;
    }



}
