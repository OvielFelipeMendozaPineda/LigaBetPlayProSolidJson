package com.ligabetplaysolidpersistencia.negocio.servicios.interfaces;

import com.ligabetplaysolidpersistencia.negocio.entidades.Equipo;

public interface EquipoCrudService {
    void createEquipo(Equipo equipo);
    Equipo readEquipo(long id);
    void updateEquipo(Equipo equipo);
    void deleteEquipo(long id);
}
