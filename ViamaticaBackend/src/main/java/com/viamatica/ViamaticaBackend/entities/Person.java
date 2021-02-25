package com.viamatica.ViamaticaBackend.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "tbl_persona")
@AllArgsConstructor @NoArgsConstructor
public class Person {

    @Id
    @Getter @Setter
    @Column(name = "cod_persona", length = 20)
    @NotNull @NotBlank @NotEmpty
    private String personCode;

    @Getter @Setter
    @Column(name = "nom_persona", length = 60)
    @NotNull @NotBlank @NotEmpty
    private String personName;

    @Getter @Setter
    @Column(name = "fec_nacimiento")
    @NotNull @NotBlank @NotEmpty
    private Date personBirth;


    /*
     * Code sector
     * code zone
     */

    /*
    * @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    * */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cod_zona_fk", referencedColumnName = "cod_zona")
    @Getter @Setter
    private Zone zone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cod_sector_fk", referencedColumnName = "cod_sector")
    @Getter @Setter
    private Sector sector;


    @Getter @Setter
    @Column(name = "Sueldo")
    @NotNull @NotBlank @NotEmpty
    private float personSalary;


}
