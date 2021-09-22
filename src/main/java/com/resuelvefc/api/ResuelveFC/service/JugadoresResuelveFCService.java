package com.resuelvefc.api.ResuelveFC.service;

import com.resuelvefc.api.ResuelveFC.model.RequestResponseSueldoJugadores;
import com.resuelvefc.api.ResuelveFC.model.bean.Jugador;
import com.resuelvefc.api.ResuelveFC.repository.JugadoresResuelveFCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JugadoresResuelveFCService {

    @Autowired
    private JugadoresResuelveFCRepository jugadoresRepository;

    double golesEquipo;
    double golesEquipoEsperados;

    public RequestResponseSueldoJugadores calcularSalario(RequestResponseSueldoJugadores listJugadores){
        golesEquipo = 0;
        golesEquipoEsperados = 0;
        countGoles(listJugadores);

        double porcentajeBonoEquipo = (golesEquipo / golesEquipoEsperados > 1) ? 1 : golesEquipo / golesEquipoEsperados;

        calcularSalarioCompletoPorJugador(listJugadores, porcentajeBonoEquipo);

        return listJugadores;
    }

    private void countGoles(RequestResponseSueldoJugadores listJugadores){
        for (Jugador jugador: listJugadores.getJugadores()){
            golesEquipo += jugador.getGoles();
            golesEquipoEsperados += jugadoresRepository.getGolesPorNivel(jugador.getNivel());
        }
    }

    private void calcularSalarioCompletoPorJugador(RequestResponseSueldoJugadores listJugadores, double porcentajeBonoEquipo){
        for (int i = 0; i < listJugadores.getJugadores().size(); i++) {
            double golesPorNivel = jugadoresRepository.getGolesPorNivel(listJugadores.getJugadores().get(i).getNivel());
            double golesJugador=listJugadores.getJugadores().get(i).getGoles();
            double porcentajeBonoJugador = (golesJugador / golesPorNivel > 1) ? 1 : golesJugador / golesPorNivel;
            double bonoJugador = ((porcentajeBonoEquipo + porcentajeBonoJugador) / 2) * listJugadores.getJugadores().get(i).getBono();
            listJugadores.getJugadores().get(i).setSueldoCompleto((int) bonoJugador + listJugadores.getJugadores().get(i).getSueldo());
        }
    }

}