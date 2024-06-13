package com.ligabetplaysolidpersistencia.negocio.servicios.interfaces;

import com.ligabetplaysolidpersistencia.negocio.entidades.CTecnico;

public interface CTecnicoCrudService {
    void createCTecnico(CTecnico tecnico);
    CTecnico readCTecnico(long id);
    void updateCTecnico(CTecnico tecnico);
    void deleteCTecnico(long id);
}
