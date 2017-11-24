/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao2.model;

import java.util.ArrayList;

/**
 *
 * @author professor
 */
public class Refeicao {
   
    private String nome;
    private ArrayList<IIngrediente> ingredientes;
    private double lucro,taxaServico,taxaLimpeza;
    private ArrayList<IImposto> impostos;
    
    
    public double preco(){
        double valor = 0;
        for (IIngrediente ing : ingredientes) {
            valor += ing.getQuantidade()*ing.getValor();
        }
        
        valor += lucro + taxaServico + taxaLimpeza;
                
        for (IImposto imp : impostos) {
            valor += imp.valorImposto();
        }
        
        return valor;
    }
    
//    public double peso(){
//        
//    }
//    
//    public String receita(){
//        
//    }

    public Refeicao() {
        this("", 0, 0, 0);
    }

    public Refeicao(String nome, double lucro, double taxaServico, double taxaLimpeza) {
        this.nome = nome;
        this.lucro = lucro;
        this.taxaServico = taxaServico;
        this.taxaLimpeza = taxaLimpeza;
        this.ingredientes = new ArrayList<>();
        this.impostos = new ArrayList<>();
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<IIngrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<IIngrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    public double getTaxaLimpeza() {
        return taxaLimpeza;
    }

    public void setTaxaLimpeza(double taxaLimpeza) {
        this.taxaLimpeza = taxaLimpeza;
    }

    public ArrayList<IImposto> getImpostos() {
        return impostos;
    }

    public void setImpostos(ArrayList<IImposto> impostos) {
        this.impostos = impostos;
    }
    
    
    
}
