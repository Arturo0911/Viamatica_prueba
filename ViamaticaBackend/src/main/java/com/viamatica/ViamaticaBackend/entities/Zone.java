package com.viamatica.ViamaticaBackend.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "tbl_zona")
@AllArgsConstructor @NoArgsConstructor
public class Zone {

    @Id
    @Column(name = "cod_zona", length = 25)
    @Getter @Setter
    @NotBlank @NotNull @NotEmpty
    private String zoneCode;

    @Column(name = "des_zona", length = 100)
    @Getter @Setter
    @NotBlank @NotNull @NotEmpty
    private String zoneDescription;

    /*
     * Constrain references by Person and Sector table
     */

    @OneToOne(mappedBy = "zone")
    @Getter @Setter
    private Person person;


    @ManyToOne
    @JoinColumn(name = "cod_sector", nullable = false)
    @Getter @Setter
    private Sector sector;


}
