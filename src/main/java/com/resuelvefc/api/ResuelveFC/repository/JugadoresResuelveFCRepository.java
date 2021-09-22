package com.resuelvefc.api.ResuelveFC.repository;

import com.resuelvefc.api.ResuelveFC.utils.PropertiesReader;
import org.springframework.stereotype.Repository;

import java.util.Properties;

@Repository
public class JugadoresResuelveFCRepository {
    Properties properties;

    public JugadoresResuelveFCRepository() throws Exception {
        properties= PropertiesReader.getProperties("resuelveFCNiveles");
    }

    public int getGolesPorNivel(String nivel){
        return Integer.parseInt(properties.getProperty(nivel));
    }
}