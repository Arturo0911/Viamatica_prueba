package com.viamatica.ViamaticaBackend.daos;

import com.viamatica.ViamaticaBackend.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends JpaRepository<Person, String> {
}
