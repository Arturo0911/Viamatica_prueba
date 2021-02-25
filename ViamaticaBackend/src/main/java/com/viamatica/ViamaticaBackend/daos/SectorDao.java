package com.viamatica.ViamaticaBackend.daos;

import com.viamatica.ViamaticaBackend.entities.Sector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorDao extends JpaRepository<Sector, String> {
}
