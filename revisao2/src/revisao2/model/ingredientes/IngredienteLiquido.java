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
public class IngredienteLiquido implements IIngrediente {

    private String nome;
    private double quantidadeCopos;
    private double precoMl;
    private double tamanhoCopo;

    public IngredienteLiquido(double tamanhoCopo) {
        this.tamanhoCopo = tamanhoCopo;
    }

    public IngredienteLiquido(String nome, double quantidadeCopos, double precoMl, double tamanhoCopo) {
        this.nome = nome;
        this.quantidadeCopos = quantidadeCopos;
        this.precoMl = precoMl;
        this.tamanhoCopo = tamanhoCopo;
    }

    @Override
    public double getQuantidade() {
        return quantidadeCopos * tamanhoCopo;
    }

    @Override
    public double getValor() {
        return precoMl;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeCopos(double quantidadeCopos) {
        this.quantidadeCopos = quantidadeCopos;
    }

    public void setPrecoMl(double precoMl) {
        this.precoMl = precoMl;
    }

    public double getTamanhoCopo() {
        return tamanhoCopo;
    }

    public void setTamanhoCopo(double tamanhoCopo) {
        this.tamanhoCopo = tamanhoCopo;
    }

}
