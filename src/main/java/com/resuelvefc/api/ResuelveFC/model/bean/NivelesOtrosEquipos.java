package com.resuelvefc.api.ResuelveFC.model.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "nivel",
        "goles"
})
public class NivelesOtrosEquipos {

    @JsonProperty("nivel")
    private String nivel;
    @JsonProperty("goles")
    private String goles;

    @JsonProperty("nivel")
    public String getNivel() {
        return nivel;
    }

    @JsonProperty("nivel")
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @JsonProperty("goles")
    public String getGoles() {
        return goles;
    }

    @JsonProperty("goles")
    public void setGoles(String goles) {
        this.goles = goles;
    }
}