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
public class IngredientePedaco implements IIngrediente {

    private String nome;
    private double quantidadePedacos;
    private double precoPorPedaco;
    private double LarguraPedaco, tamanhoPedaco;

    public IngredientePedaco() {
    }

    public IngredientePedaco(String nome, double quantidadePedacos, double precoPorPedaco, double LarguraPedaco, double tamanhoPedaco) {
        this.nome = nome;
        this.quantidadePedacos = quantidadePedacos;
        this.precoPorPedaco = precoPorPedaco;
        this.LarguraPedaco = LarguraPedaco;
        this.tamanhoPedaco = tamanhoPedaco;
    }

    @Override
    public double getQuantidade() {
        return quantidadePedacos;
    }

    @Override
    public double getValor() {
        return precoPorPedaco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadePedacos(double quantidadePedacos) {
        this.quantidadePedacos = quantidadePedacos;
    }

    public void setPrecoPorPedaco(double precoPorPedaco) {
        this.precoPorPedaco = precoPorPedaco;
    }

    public double getLarguraPedaco() {
        return LarguraPedaco;
    }

    public void setLarguraPedaco(double LarguraPedaco) {
        this.LarguraPedaco = LarguraPedaco;
    }

    public double getTamanhoPedaco() {
        return tamanhoPedaco;
    }

    public void setTamanhoPedaco(double tamanhoPedaco) {
        this.tamanhoPedaco = tamanhoPedaco;
    }

}
