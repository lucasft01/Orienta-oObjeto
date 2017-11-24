/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao2.model.ingredientes;

import revisao2.model.IIngrediente;

/**
 *
 * @author professor
 */
public class IngredienteGramas implements IIngrediente {

    private String nome;
    private double pesoEmGramas;
    private double precoPorGrama;
    private double usoRecomendado;

    public IngredienteGramas() {
    }

    public IngredienteGramas(String nome, double pesoEmGramas, double precoPorGrama, double usoRecomendado) {
        this.nome = nome;
        this.pesoEmGramas = pesoEmGramas;
        this.precoPorGrama = precoPorGrama;
        this.usoRecomendado = usoRecomendado;
    }

    @Override
    public double getQuantidade() {
        if (pesoEmGramas <= usoRecomendado) {
            return pesoEmGramas;
        } else {
            return 0;
        }
    }

    @Override
    public double getValor() {
        return precoPorGrama;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPesoEmGramas(double pesoEmGramas) {
        this.pesoEmGramas = pesoEmGramas;
    }

    public void setPrecoPorGrama(double precoPorGrama) {
        this.precoPorGrama = precoPorGrama;
    }

    public double getUsoRecomendado() {
        return usoRecomendado;
    }

    public void setUsoRecomendado(double usoRecomendado) {
        this.usoRecomendado = usoRecomendado;
    }

}
