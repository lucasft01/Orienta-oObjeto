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
public class Carreta extends Veiculo implements IVeiculoCarga {

    private double valorAluguelCarroceria;
    private int numeroEixos;
    
    @Override
    public double valorkm() {
        return ((getValorCompra() - depreciacao())/500000)
                +getValorAluguelCarroceria()/30;
    }

    @Override
    public double precoFrete(double kmPercorrido) {
        return kmPercorrido * valorkm();
    }

    public Carreta() {
    }

    public Carreta(double valorAluguelCarroceria, int numeroEixos, String placa, int ano, double valorCompra) {
        super(placa, ano, valorCompra);
        this.valorAluguelCarroceria = valorAluguelCarroceria;
        this.numeroEixos = numeroEixos;
    }

    public double getValorAluguelCarroceria() {
        return valorAluguelCarroceria;
    }

    public void setValorAluguelCarroceria(double valorAluguelCarroceria) {
        this.valorAluguelCarroceria = valorAluguelCarroceria;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    
    
}
