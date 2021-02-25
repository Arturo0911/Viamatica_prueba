package com.viamatica.ViamaticaBackend.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_sector")
@AllArgsConstructor @NoArgsConstructor
public class Sector {

    @Id
    @Getter @Setter
    @Column(name = "cod_sector", length = 25)
    @NotEmpty @NotNull @NotBlank
    private String sectorCode;

    @Getter @Setter
    @Column(name = "des_sector", length = 200)
    @NotEmpty @NotNull @NotBlank
    private String sectorDescription;


    /*
     * Constrain references by Person and Zone table
     */

    @OneToOne(fetch = FetchType.LAZY,mappedBy = "sector")
    @Getter @Setter
    private Person person;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "sector")
    @Getter @Setter
    private Set<Zone> zones = new HashSet<>();;


}
