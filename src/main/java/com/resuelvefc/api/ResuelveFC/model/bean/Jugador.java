package com.resuelvefc.api.ResuelveFC.model.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "nombre",
        "nivel",
        "goles",
        "sueldo",
        "bono",
        "sueldo_completo",
        "equipo"
})

public class Jugador {

    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("nivel")
    private String nivel;
    @JsonProperty("goles")
    private Integer goles;
    @JsonProperty("sueldo")
    private Integer sueldo;
    @JsonProperty("bono")
    private Integer bono;
    @JsonProperty("sueldo_completo")
    private Integer sueldoCompleto;
    @JsonProperty("equipo")
    private String equipo;

    @JsonProperty("nombre")
    public String getNombre() {
        return nombre;
    }

    @JsonProperty("nombre")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @JsonProperty("nivel")
    public String getNivel() {
        return nivel;
    }

    @JsonProperty("nivel")
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @JsonProperty("goles")
    public Integer getGoles() {
        return goles;
    }

    @JsonProperty("goles")
    public void setGoles(Integer goles) {
        this.goles = goles;
    }

    @JsonProperty("sueldo")
    public Integer getSueldo() {
        return sueldo;
    }

    @JsonProperty("sueldo")
    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    @JsonProperty("bono")
    public Integer getBono() {
        return bono;
    }

    @JsonProperty("bono")
    public void setBono(Integer bono) {
        this.bono = bono;
    }

    @JsonProperty("sueldo_completo")
    public Integer getSueldoCompleto() {
        return sueldoCompleto;
    }

    @JsonProperty("sueldo_completo")
    public void setSueldoCompleto(Integer sueldoCompleto) {
        this.sueldoCompleto = sueldoCompleto;
    }

    @JsonProperty("equipo")
    public String getEquipo() {
        return equipo;
    }

    @JsonProperty("equipo")
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
}