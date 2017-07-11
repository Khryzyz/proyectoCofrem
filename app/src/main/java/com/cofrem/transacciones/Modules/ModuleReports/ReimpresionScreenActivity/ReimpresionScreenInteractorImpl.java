package com.cofrem.transacciones.Modules.ModuleReports.ReimpresionScreenActivity;

import android.content.Context;
import android.util.Log;

class ReimpresionScreenInteractorImpl implements ReimpresionScreenInteractor {
    /**
     * #############################################################################################
     * Declaracion de componentes y variables
     * #############################################################################################
     */

    /**
     * #############################################################################################
     * Instanciamientos de las clases
     * #############################################################################################
     */
    private ReimpresionScreenRepository reimpresionScreenRepository;

    /**
     * #############################################################################################
     * Constructor de la clase
     * #############################################################################################
     */
    public ReimpresionScreenInteractorImpl() {

        reimpresionScreenRepository = new ReimpresionScreenRepositoryImpl();

    }

    @Override
    public void validarClaveAdministrador(Context context, String clave) {
        reimpresionScreenRepository.validarClaveAdministrador(context, clave);
    }

    @Override
    public void validarExistenciaUltimoRecibo(Context context) {
        reimpresionScreenRepository.validarExistenciaUltimoRecibo(context);
    }

    @Override
    public void validarExistenciaReciboConNumCargo(Context context, String numCargo) {
        reimpresionScreenRepository.validarExistenciaReciboConNumCargo(context,numCargo);
    }

    @Override
    public void validarExistenciaDetalleRecibos(Context context) {
        reimpresionScreenRepository.validarExistenciaDetalleRecibos(context);
    }
    /**
     * #############################################################################################
     * Metodos sobrecargados de la interface
     * #############################################################################################
     */




}
