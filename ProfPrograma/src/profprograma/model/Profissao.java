/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profprograma.model;

/**
 *
 * @author professor
 */
public abstract class Profissao {
    
    private String nome;
    private double salario;
    private int tempoServico;
    private boolean ehTrabalhadorNoturno;

    public Profissao() {
    }

    public Profissao(String nome, double salario, int tempoServico, boolean ehTrabalhadorNoturno) {
        this.nome = nome;
        this.salario = salario;
        this.tempoServico = tempoServico;
        this.ehTrabalhadorNoturno = ehTrabalhadorNoturno;
    }

    public abstract double valorAposentadoria();
    
        
    public double salario(){
        return salario - inss() + abonoNoturno();
    }

    protected double abonoNoturno() {
        return ehTrabalhadorNoturno?0.15*salario:0;
    }

    protected double inss() {
        return 0.13*salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public boolean isEhTrabalhadorNoturno() {
        return ehTrabalhadorNoturno;
    }

    public void setEhTrabalhadorNoturno(boolean ehTrabalhadorNoturno) {
        this.ehTrabalhadorNoturno = ehTrabalhadorNoturno;
    }
    
    
    
}
