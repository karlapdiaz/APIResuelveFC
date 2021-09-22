package com.resuelvefc.api.ResuelveFC.controller;

import com.resuelvefc.api.ResuelveFC.model.RequestOtrosEquiposSueldo;

import com.resuelvefc.api.ResuelveFC.model.RequestResponseSueldoJugadores;
import com.resuelvefc.api.ResuelveFC.service.JugadoresOtrosEquiposService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("API que calcula el sueldo de los jugadores de otros equipos")
public class SalarioOtrosEquiposController {

    @Autowired
    private JugadoresOtrosEquiposService jugadoresService;

    @PostMapping("/calcular/salario/otros_equipos")
    @ResponseBody
    @ApiOperation("This is the POST request")
    public RequestResponseSueldoJugadores calcularSalarioResuelveFC(@RequestBody RequestOtrosEquiposSueldo jugadores) {
        return jugadoresService.calcularSalario(jugadores);
    }
}