
package com.ligabetplaysolidpersistencia.negocio.servicios.interfaces;

import com.ligabetplaysolidpersistencia.negocio.entidades.CMedico;

public interface CMedicoCrudService {
    void createCMedico(CMedico medico);
    CMedico readCMedico(long id);
    void updateCMedico(CMedico medico);
    void deleteCMedico(long id);
}
