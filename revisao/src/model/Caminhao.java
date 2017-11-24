/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import model.categoria.EtipoTransporte;

/**
 *
 * @author professor
 */
public class Caminhao extends Veiculo implements IVeiculoCarga {

    private double capacidadeCarga, cargaTransportada;
    private boolean truck;
    private EtipoTransporte tipo;
    private ArrayList<IAjudante> ajudantes;

    @Override
    public double precoFrete(double kmPercorrido) {
        return kmPercorrido * valorkm();
    }

    @Override
    public double valorkm() {
        double vlr = 0;
        for (IAjudante chapa : ajudantes) {
            vlr += chapa.getValor();
        }

        return (((getValorCompra() - depreciacao())
                + ((1 - (capacidadeCarga - cargaTransportada)) * 50000))
                * (truck ? 0.85 : 1)
                + vlr) / 100000;
    }

    public Caminhao() {
        ajudantes = new ArrayList<>();
    }

    public Caminhao(double capacidadeCarga, double cargaTransportada, boolean truck, EtipoTransporte tipo, String placa, int ano, double valorCompra) {
        super(placa, ano, valorCompra);
        this.capacidadeCarga = capacidadeCarga;
        this.cargaTransportada = cargaTransportada;
        this.truck = truck;
        this.tipo = tipo;
        ajudantes = new ArrayList<>();
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCargaTransportada() {
        return cargaTransportada;
    }

    public void setCargaTransportada(double cargaTransportada) {
        this.cargaTransportada = cargaTransportada;
    }

    public boolean isTruck() {
        return truck;
    }

    public void setTruck(boolean truck) {
        this.truck = truck;
    }

    public EtipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(EtipoTransporte tipo) {
        this.tipo = tipo;
    }

    public ArrayList<IAjudante> getAjudantes() {
        return ajudantes;
    }

    public void setAjudantes(ArrayList<IAjudante> chapas) {
        this.ajudantes = chapas;
    }

}
