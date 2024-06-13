package com.ligabetplaysolidpersistencia.negocio.servicios.interfaces;

import com.ligabetplaysolidpersistencia.negocio.entidades.Partido;

public interface PartidoCrudService {
    void createPartido(Partido partido);
    Partido readPartido(long id);
    void updatePartido(Partido partido);
    void deletePartido(long id);
}
