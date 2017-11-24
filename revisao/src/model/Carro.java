/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author professor
 */
public class Carro extends Veiculo {

    private double potenciaMotor;
    private boolean cambioAutomatico;

    @Override
    public double valorkm() {

        return ((getValorCompra() - depreciacao())
                * (1 + (potenciaMotor * 0.1))
                * (cambioAutomatico ? 1.2 : 1)) / 150000;
    }

    public Carro() {
    }

    public Carro(double potenciaMotor, boolean cambioAutomatico, String placa, int ano, double valorCompra) {
        super(placa, ano, valorCompra);
        this.potenciaMotor = potenciaMotor;
        this.cambioAutomatico = cambioAutomatico;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

}
