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
@Table(name = "tbl_zona")
@AllArgsConstructor @NoArgsConstructor
public class Zone {

    @Id
    @Column(name = "cod_zona", length = 25)
    @Getter @Setter
    @NotBlank @NotNull @NotEmpty
    private String zoneCode;

    @Column(name = "des_zona", length = 25)
    @Getter @Setter
    @NotBlank @NotNull @NotEmpty
    private String zoneDescription;

    /*
    * Code sector here
    * */
}
