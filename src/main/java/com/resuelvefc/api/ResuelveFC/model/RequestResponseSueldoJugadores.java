package com.resuelvefc.api.ResuelveFC.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.resuelvefc.api.ResuelveFC.model.bean.Jugador;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "jugadores"
})

public class RequestResponseSueldoJugadores {
    @JsonProperty("jugadores")
    private List<Jugador> jugadores = null;

    @JsonProperty("jugadores")
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    @JsonProperty("jugadores")
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}