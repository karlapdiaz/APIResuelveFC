package com.resuelvefc.api.ResuelveFC.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.resuelvefc.api.ResuelveFC.model.bean.Jugador;
import com.resuelvefc.api.ResuelveFC.model.bean.NivelesOtrosEquipos;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "jugadores",
        "niveles"
})

public class RequestOtrosEquiposSueldo {

    @JsonProperty("jugadores")
    private List<Jugador> jugadores = null;
    @JsonProperty("niveles")
    private List<NivelesOtrosEquipos> niveles = null;


    @JsonProperty("jugadores")
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    @JsonProperty("jugadores")
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @JsonProperty("niveles")
    public List<NivelesOtrosEquipos> getNiveles() {
        return niveles;
    }

    @JsonProperty("niveles")
    public void setNiveles(List<NivelesOtrosEquipos> niveles) {
        this.niveles = niveles;
    }
}