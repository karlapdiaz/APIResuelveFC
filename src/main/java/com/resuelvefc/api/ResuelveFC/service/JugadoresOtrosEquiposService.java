package com.resuelvefc.api.ResuelveFC.service;

import com.resuelvefc.api.ResuelveFC.model.RequestOtrosEquiposSueldo;
import com.resuelvefc.api.ResuelveFC.model.RequestResponseSueldoJugadores;
import com.resuelvefc.api.ResuelveFC.model.bean.Jugador;
import com.resuelvefc.api.ResuelveFC.model.bean.NivelesOtrosEquipos;
import org.springframework.stereotype.Service;


@Service
public class JugadoresOtrosEquiposService {

    double golesEquipo;
    double golesEquipoEsperados;

    public RequestResponseSueldoJugadores calcularSalario(RequestOtrosEquiposSueldo request){
        golesEquipo = 0;
        golesEquipoEsperados = 0;

        countGoles(request);

        double porcentajeBonoEquipo = (golesEquipo / golesEquipoEsperados > 1) ? 1 : golesEquipo / golesEquipoEsperados;

        calcularSalarioCompletoPorJugador(request, porcentajeBonoEquipo);

        RequestResponseSueldoJugadores response = new RequestResponseSueldoJugadores();
        response.setJugadores(request.getJugadores());
        return response;
    }

    private void countGoles(RequestOtrosEquiposSueldo request){
        for (Jugador jugador: request.getJugadores()){
            golesEquipo += jugador.getGoles();
            golesEquipoEsperados+= getGolesPorNivel(request,jugador);
        }
    }

    private void calcularSalarioCompletoPorJugador(RequestOtrosEquiposSueldo request, double porcentajeBonoEquipo){
        for (int i = 0; i < request.getJugadores().size(); i++) {
            double golesPorNivel = getGolesPorNivel(request, request.getJugadores().get(i));
            Jugador jugador = request.getJugadores().get(i);
            double golesJugador=jugador.getGoles();
            double porcentajeBonoJugador = (golesJugador / golesPorNivel > 1) ? 1 : golesJugador / golesPorNivel;
            double bonoJugador = ((porcentajeBonoEquipo + porcentajeBonoJugador) / 2) * jugador.getBono();
            request.getJugadores().get(i).setSueldoCompleto((int) bonoJugador + jugador.getSueldo());
        }
    }

    private int getGolesPorNivel(RequestOtrosEquiposSueldo request, Jugador jugador){
        for (NivelesOtrosEquipos niveles : request.getNiveles()){
            if(niveles.getNivel().equals(jugador.getNivel())) return Integer.parseInt(niveles.getGoles());
        }
        return 0;
    }
}