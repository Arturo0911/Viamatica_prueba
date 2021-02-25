package com.viamatica.ViamaticaBackend.daos;

import com.viamatica.ViamaticaBackend.entities.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneDao extends JpaRepository<Zone, String> {
}
