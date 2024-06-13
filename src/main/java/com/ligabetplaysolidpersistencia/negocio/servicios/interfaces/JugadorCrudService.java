package com.ligabetplaysolidpersistencia.negocio.servicios.interfaces;

import com.ligabetplaysolidpersistencia.negocio.entidades.Jugador;

public interface JugadorCrudService {
    void createJugador(Jugador jugador);
    Jugador readJugador(long id);
    void updateJugador(Jugador jugador);
    void deleteJugador(long id);
}
