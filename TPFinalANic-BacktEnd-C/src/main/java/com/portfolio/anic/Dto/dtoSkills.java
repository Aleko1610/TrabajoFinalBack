package com.portfolio.anic.Dto;

import javax.validation.constraints.NotBlank;

public class dtoSkills {
    @NotBlank
    private String nombreS;
    @NotBlank
    private String descripcionS;

    public dtoSkills() {
    }

    public dtoSkills(String nombreS, String descripcionS) {
        this.nombreS = nombreS;
        this.descripcionS = descripcionS;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getDescripcionS() {
        return descripcionS;
    }

    public void setDescripcionS(String descripcionS) {
        this.descripcionS = descripcionS;
    }
    
    
}
