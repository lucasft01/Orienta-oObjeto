/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao2.model.imposto;

import revisao2.model.IImposto;

/**
 *
 * @author professor
 */
public class ISS implements IImposto {

    private double valorServicoPrestado;
    private boolean ehSimples;

    @Override
    public double valorImposto() {
        return (ehSimples?0.57:valorServicoPrestado*0.012);
    }

    public ISS() {
    }

    public ISS(double valorServicoPrestado, boolean ehSimples) {
        this.valorServicoPrestado = valorServicoPrestado;
        this.ehSimples = ehSimples;
    }

    public double getValorServicoPrestado() {
        return valorServicoPrestado;
    }

    public void setValorServicoPrestado(double valorServicoPrestado) {
        this.valorServicoPrestado = valorServicoPrestado;
    }

    public boolean isEhSimples() {
        return ehSimples;
    }

    public void setEhSimples(boolean ehSimples) {
        this.ehSimples = ehSimples;
    }

}
