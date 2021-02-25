package com.viamatica.ViamaticaBackend.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern="dd/MM/yy")
    private Date personBirth;


    /*
     * Code sector
     * code zone
     */

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cod_zona", referencedColumnName = "cod_zona")
    @Getter @Setter
    private Zone zone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cod_sector", referencedColumnName = "cod_sector")
    @Getter @Setter
    private Sector sector;


    @Getter @Setter
    @Column(name = "Sueldo")
    private float personSalary;


}
