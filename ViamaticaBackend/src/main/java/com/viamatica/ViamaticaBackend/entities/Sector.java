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


}
