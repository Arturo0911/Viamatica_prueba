package com.viamatica.ViamaticaBackend.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
    private String personBirth;

    /*
     * Code sector
     * code zone
     */


    @Getter @Setter
    @Column(name = "Sueldo")
    @NotNull @NotBlank @NotEmpty
    private float personSalary;


}