/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author professor
 */
public abstract class Veiculo {
   
    public static double precoGasolina = 4.10;
    private String placa;
    private int ano;
    private double valorCompra;

    public Veiculo() {
    }

    public Veiculo(String placa, int ano, double valorCompra) {
        this.placa = placa;
        this.ano = ano;
        this.valorCompra = valorCompra;
    }
    
    public abstract double valorkm();
    
    public double depreciacao(){
        Calendar c = Calendar.getInstance();
        int anoAtual = c.get(Calendar.YEAR);
        return valorCompra * (1-(anoAtual - ano)*0.03);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    
}
