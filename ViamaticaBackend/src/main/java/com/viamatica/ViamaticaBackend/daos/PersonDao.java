package com.viamatica.ViamaticaBackend.daos;

import com.viamatica.ViamaticaBackend.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface PersonDao extends JpaRepository<Person, String> {
     // select by age lesser than 65 years old
    /*@Modifying
    @Query(value = "SELECT * FROM tbl_persona ORDER BY fec_nacimiento ASC;", nativeQuery = true)
    @Transactional
    List<Person> findPersonOrderByAge();

    @Modifying
    @Query(value = "DELETE FROM tbl_persona WHERE cod_persona=:personCode", nativeQuery = true)
    void deleteByPersonCode(@Param("personCode") String personCode);*/

    /*@Modifying
    @Query(value = "DELETE FROM tbl_persona WHERE cod_persona=:personCode", nativeQuery = true)
    @Transactional
    void deleteByPersonCode(@Param("personCode") String personCode);*/

    //Long deleteByCode(String personCode);


}
